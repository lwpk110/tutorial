package cn.steven.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTargetProxy implements InvocationHandler {

    private final Target target;

    public JdkTargetProxy(Target target) {
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==>JDK 代理前...");
        Object invoke = method.invoke(target, args);
        System.out.printf("被代理返回：%s%n", invoke.toString());
        System.out.println("==>JDK 代理后...");
        return String.format("jdk 代理后返回：%s", invoke.toString());
    }
}
