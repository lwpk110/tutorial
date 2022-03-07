package cn.steven.demo.proxy;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

class JdkProxyTest {

    @Test
    void invoke() throws JsonProcessingException {
        System.out.println("保存生成的代理类字节码文件");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Target proxy = new JdkTargetProxy(new TargetImpl()).getProxy(); // 在 Target 实现类织入代理aop，获取一个代理类
        String actualProxiedResult = proxy.execute("lu wei"); // 调用代理类
        System.out.println(actualProxiedResult);
    }
}