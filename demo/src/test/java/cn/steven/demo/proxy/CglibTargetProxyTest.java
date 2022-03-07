package cn.steven.demo.proxy;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

class CglibTargetProxyTest {

    @Test
    void proxy() {
        CglibTargetProxy cglibTargetProxy = new CglibTargetProxy();
        TargetImpl proxy = cglibTargetProxy.getProxy();
        String actualInvokedReturnString = proxy.execute("steven");
        System.out.println(actualInvokedReturnString);
        Integer actualInvokedReturnInt = proxy.executeInt(2);
        System.out.println(actualInvokedReturnInt);
        assertAll(() -> {
            assertEquals("fixed Value", actualInvokedReturnString);
            assertEquals(2, actualInvokedReturnInt);
        });
    }

    @Test
    void generateBean()
            throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        CglibTargetProxy cglibTargetProxy = new CglibTargetProxy();
        Object o = cglibTargetProxy.get();
        System.out.println(o.toString());
    }
}