package nio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NioTest {

    @Test
    void readResourcePath() throws URISyntaxException {

        Assertions.assertAll("resource 路径的开始", () -> {
            URL classLoadResource1 = this.getClass().getClassLoader().getResource("");
            URL classLoadResource2 = this.getClass().getClassLoader().getResource("/");  // x
            URL classResource1 = this.getClass().getResource("");
            URL classResource2 = this.getClass().getResource("/");

            Assertions.assertNotNull(classLoadResource1);
            Assertions.assertNull(classLoadResource2);
            Assertions.assertNotNull(classResource1);
            Assertions.assertNotNull(classResource2);
            assertEquals("/data/home/luwei/work/github/tutorial/io/build/classes/java/test/",
                    classLoadResource1.getPath());
            assertEquals("/data/home/luwei/work/github/tutorial/io/build/classes/java/test/nio/",
                    classResource1.getPath());
            assertEquals("/data/home/luwei/work/github/tutorial/io/build/classes/java/test/",
                    classResource2.getPath());
        });
        Assertions.assertAll("查找文件", () -> {
            URL classLoadResource1 = this.getClass().getClassLoader()
                    .getResource("data/nio-data.txt");
            URL classResource1 = this.getClass().getResource("nio2.txt");
            URL classResource2 = this.getClass().getResource("nio/nio2.txt"); // x

            Assertions.assertNotNull(classLoadResource1);
            Assertions.assertNotNull(classResource1);
            Assertions.assertNull(classResource2);
            assertEquals(
                    "/data/home/luwei/work/github/tutorial/io/build/resources/test/data/nio-data.txt",
                    classLoadResource1.getPath());
            assertEquals(
                    "/data/home/luwei/work/github/tutorial/io/build/resources/test/nio/nio2.txt",
                    classResource1.getPath());
        });
    }

    /**
     * buffer 的几个重要属性：
     * <ul>
     *     <li>{@link Buffer#capacity} - 容量，作为一个内存块，他的容量固定不变，一旦buffer 已满，需要先清空</li>
     *     <li>{@link Buffer#position} - 位置， 字节写入或者读取时的指针位置，最大为 capacity -1 </li>
     *     <li>{@link Buffer#limit} -  你已写入缓冲区的做大字节容量，limit <= capacity </li>
     * </ul>
     *
     * @throws IOException
     */
    @Test
    void readToBuffer() throws IOException {

        File file = new File("src/test/resources/data/nio-data.txt"); // 40个字节
//        FileInputStream fileInputStream = new FileInputStream(file);
//        int len;
//        while ((len = fileInputStream.read())!=-1){
//            System.out.println((char)len);
//        }

        RandomAccessFile givenFile = new RandomAccessFile(file, "rw");
        Assertions.assertNotNull(givenFile);

        FileChannel channel = givenFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(30);
        int read = channel.read(byteBuffer); // 将字节读入缓冲区

        while (read != -1) {  // 40个字节 读入缓冲区两次  30 + 10
            System.out.println("read " + read);
            byteBuffer.flip();  // 将byteBuffer 写模式切换到读模式， position =0 ，limit-字节实际长度，limit =30或者 10
            while (byteBuffer.hasRemaining()) {  //position < limit
                System.out.println((char) byteBuffer.get()); // get() - position 指针移动一个字节获取当前位置字符。
            }
//           byteBuffer.rewind();  // 可以从头开始
//            byteBuffer.compact(); // 将 原有数据压缩到头部，指针移到尾部，limit 变为cap
            byteBuffer.clear();  // buffer 被清空，单数数据为清空，指针告诉你从0开始可以写入，会覆盖数据
            read = channel.read(byteBuffer);
        }
        givenFile.close();
    }

    @Test
    public void givenFile_whenReadWithFileChannelUsingRandomAccessFile_thenCorrect()
            throws IOException {
        RandomAccessFile reader = new RandomAccessFile("src/test/resources/data/oneline.txt",
                "r");
        FileChannel channel = reader.getChannel();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bufferSize = 1024;
        if (bufferSize > channel.size()) {
            bufferSize = (int) channel.size();
        }
        ByteBuffer buff = ByteBuffer.allocate(bufferSize);

        while (channel.read(buff) > 0) {
            out.write(buff.array(), 0, buff.position());
            buff.clear();
        }

        String fileContent = new String(out.toByteArray(), StandardCharsets.UTF_8);

        assertEquals("hello world!!", fileContent);

    }
    @Test
    public void whenWriteWithFileChannelUsingRandomAccessFile_thenCorrect()
            throws IOException {
        String file = "src/test/resources/data/out/test_write_using_filechannel.txt";
        try (RandomAccessFile writer = new RandomAccessFile(file, "rw");
                FileChannel channel = writer.getChannel()){
            ByteBuffer buff = ByteBuffer.wrap("Hello world".getBytes(StandardCharsets.UTF_8));

            channel.write(buff);

            // verify
            RandomAccessFile reader = new RandomAccessFile(file, "r");
            assertEquals("Hello world", reader.readLine());
            reader.close();
        }
    }

    @Test
    void scatterGather() throws IOException {
        File file = new File("src/test/resources/data/nio-data.txt"); // 40个字节
        RandomAccessFile givenFile = new RandomAccessFile(file, "rw");
        Assertions.assertNotNull(givenFile);

        FileChannel channel = givenFile.getChannel();
        ByteBuffer header = ByteBuffer.allocate(10);
        ByteBuffer body = ByteBuffer.allocate(40);
        ByteBuffer[] bufferArray = {header, body};
        channel.read(bufferArray);

        File gatherFile = new File("src/test/resources/data/output/gather-res.txt");
        RandomAccessFile gatherRandomAccessFile = new RandomAccessFile(gatherFile, "rw");
        FileChannel gatherFileChannel = gatherRandomAccessFile.getChannel();
        gatherFileChannel.write(bufferArray);
    }

    @Test
    void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/test/resources/data/output/write.txt");
        FileChannel channel = fos.getChannel();
        channel.write(ByteBuffer.wrap(new String("hello world").getBytes(StandardCharsets.UTF_8)));
        channel.close();

        File gatherFile = new File("src/test/resources/data/output/write-byteBuffer.txt");
        RandomAccessFile gatherRandomAccessFile = new RandomAccessFile(gatherFile, "rw");
        FileChannel gatherFileChannel = gatherRandomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1000);
        byteBuffer.put(new String("hello, byteButter").getBytes(StandardCharsets.UTF_8));
        gatherFileChannel.write(byteBuffer);


    }

}
