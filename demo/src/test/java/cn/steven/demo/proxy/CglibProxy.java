package cn.steven.demo.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CglibProxy {

    @Test
    void cglib_fixedValue() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetImpl.class);
        enhancer.setCallback((FixedValue) () -> "==> cglib fix value");
        TargetImpl proxy = (TargetImpl) enhancer.create();
        String actualExecuteResult = proxy.execute(" lu wei");
        Assertions.assertEquals("==> cglib fix value", actualExecuteResult);
    }

    @Test
    void cglib_methodInterceptor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetImpl.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "fixed Value";
            }else {
                return proxy.invokeSuper(obj, args);
            }
        });
        TargetImpl proxy = (TargetImpl) enhancer.create();
        String execute = proxy.execute(null);
        System.out.println(execute);
        String steven = proxy.execute("steven");
        System.out.println(steven);
        Integer integer = proxy.executeInt(1);
        System.out.println(integer);
    }

}
