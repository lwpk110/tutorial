package cn.steven.demo.common;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SystemPropertiesTest {

    ObjectMapper objectMapper = new ObjectMapper();

    SystemProperties systemProperties = new SystemProperties();

    @Test
    void getSystemProperties() throws JsonProcessingException {
        String actualProperties = objectMapper.writeValueAsString(systemProperties.getSystemProperties());
        System.out.println(actualProperties);
//        Assertions.assertEquals("{\"java.runtime.name\":\"OpenJDK Runtime Environment\",\"sun.boot.library.path\":\"/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/amd64\",\"java.vm.version\":\"25.275-b01\",\"java.vm.vendor\":\"AdoptOpenJDK\",\"java.vendor.url\":\"https://adoptopenjdk.net/\",\"path.separator\":\":\",\"java.vm.name\":\"OpenJDK 64-Bit Server VM\",\"file.encoding.pkg\":\"sun.io\",\"user.country\":\"CN\",\"sun.java.launcher\":\"SUN_STANDARD\",\"sun.os.patch.level\":\"unknown\",\"java.vm.specification.name\":\"Java Virtual Machine Specification\",\"user.dir\":\"/data/home/luwei/work/github/tutorial/demo\",\"java.runtime.version\":\"1.8.0_275-b01\",\"java.awt.graphicsenv\":\"sun.awt.X11GraphicsEnvironment\",\"java.endorsed.dirs\":\"/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/endorsed\",\"os.arch\":\"amd64\",\"java.io.tmpdir\":\"/tmp\",\"line.separator\":\"\\n\",\"java.vm.specification.vendor\":\"Oracle Corporation\",\"os.name\":\"Linux\",\"sun.jnu.encoding\":\"UTF-8\",\"java.library.path\":\"/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib\",\"java.specification.name\":\"Java Platform API Specification\",\"java.class.version\":\"52.0\",\"sun.management.compiler\":\"HotSpot 64-Bit Tiered Compilers\",\"os.version\":\"5.10.60-amd64-desktop\",\"user.home\":\"/home/luwei\",\"user.timezone\":\"Asia/Shanghai\",\"java.awt.printerjob\":\"sun.print.PSPrinterJob\",\"file.encoding\":\"UTF-8\",\"java.specification.version\":\"1.8\",\"java.class.path\":\"/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-launcher/1.7.2/junit-platform-launcher-1.7.2.jar:/data/home/luwei/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-engine/1.7.2/junit-platform-engine-1.7.2.jar:/data/home/luwei/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/data/home/luwei/.m2/repository/org/junit/platform/junit-platform-commons/1.7.2/junit-platform-commons-1.7.2.jar:/opt/apps/idea-IU-203.5981.155/lib/idea_rt.jar:/opt/apps/idea-IU-203.5981.155/plugins/junit/lib/junit5-rt.jar:/opt/apps/idea-IU-203.5981.155/plugins/junit/lib/junit-rt.jar:/data/home/luwei/work/github/tutorial/demo/build/classes/java/test:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/charsets.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/cldrdata.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/dnsns.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/jaccess.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/localedata.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/nashorn.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunec.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunjce_provider.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/sunpkcs11.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext/zipfs.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jce.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jfr.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jsse.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/management-agent.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/resources.jar:/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/rt.jar:/data/home/luwei/work/github/tutorial/demo/build/classes/java/main:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.12.4/jackson-databind-2.12.4.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter/5.7.2/62faa742964a9d8dab8fdb4a0eab7b01441c171f/junit-jupiter-5.7.2.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.mockito/mockito-junit-jupiter/3.9.0/871745ab6af5a269411ea3c1f99ced82ed079436/mockito-junit-jupiter-3.9.0.jar:/home/luwei/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.12.4/jackson-annotations-2.12.4.jar:/home/luwei/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.12.4/jackson-core-2.12.4.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-params/5.7.2/685f832f8c54dd40100f646d61aca88ed9545421/junit-jupiter-params-5.7.2.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/org.mockito/mockito-core/3.9.0/b7573430aea743b26434b44f4f46272af613e660/mockito-core-3.9.0.jar:/home/luwei/.m2/repository/org/junit/platform/junit-platform-commons/1.7.2/junit-platform-commons-1.7.2.jar:/home/luwei/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/home/luwei/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/luwei/.m2/repository/net/bytebuddy/byte-buddy/1.10.22/byte-buddy-1.10.22.jar:/data/home/luwei/.gradle/caches/modules-2/files-2.1/net.bytebuddy/byte-buddy-agent/1.10.22/b01df6b71a882b9fde5a608a26e641cd399a4d83/byte-buddy-agent-1.10.22.jar:/home/luwei/.m2/repository/org/objenesis/objenesis/3.2/objenesis-3.2.jar:/home/luwei/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar:/home/luwei/.m2/repository/org/junit/platform/junit-platform-engine/1.7.2/junit-platform-engine-1.7.2.jar:/opt/apps/idea-IU-203.5981.155/lib/idea_rt.jar\",\"user.name\":\"luwei\",\"java.vm.specification.version\":\"1.8\",\"sun.java.command\":\"com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 cn.steven.demo.common.SystemPropertiesTest,getSystemProperties\",\"java.home\":\"/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre\",\"sun.arch.data.model\":\"64\",\"user.language\":\"zh\",\"java.specification.vendor\":\"Oracle Corporation\",\"awt.toolkit\":\"sun.awt.X11.XToolkit\",\"java.vm.info\":\"mixed mode\",\"java.version\":\"1.8.0_275\",\"java.ext.dirs\":\"/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/ext:/usr/java/packages/lib/ext\",\"sun.boot.class.path\":\"/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/resources.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/rt.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/sunrsasign.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jsse.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jce.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/charsets.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/lib/jfr.jar:/data/home/luwei/.jdks/adopt-openjdk-1.8.0_275/jre/classes\",\"java.vendor\":\"AdoptOpenJDK\",\"file.separator\":\"/\",\"java.vendor.url.bug\":\"https://github.com/AdoptOpenJDK/openjdk-support/issues\",\"idea.test.cyclic.buffer.size\":\"1048576\",\"sun.io.unicode.encoding\":\"UnicodeLittle\",\"sun.cpu.endian\":\"little\",\"sun.desktop\":\"gnome\",\"sun.cpu.isalist\":\"\"}",actualProperties);
    }

    @Test
    void getEnv() throws JsonProcessingException {
        String actualEnv = objectMapper.writeValueAsString(systemProperties.getEnv());
//        System.out.println(actualEnv);
    }
}