package cn.steven.demo.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @see net.sf.cglib.proxy.Callback
 */
public class CglibTargetProxy implements MethodInterceptor {

    /**
     * 当方法签名不是来自Object类时，我们将拦截所有调用，这意味着toString()或hashCode()方法将不会被拦截。除此之外，
     * 我们只截取返回String的PersonService的方法。对lengthOfName()方法的调用不会被拦截，因为它的返回类型是Integer。
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
            throws Throwable {

        System.out.println("==> cglib proxy 前。。。");
        if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
            System.out.println("==> cglib proxy 后。。。");
            return "fixed Value";
        } else {
            System.out.println("==> cglib proxy 后。。。");
            return proxy.invokeSuper(obj, args); //代理类调用父类被代理类-targetImpl 的方法
        }
    }

    /**
     *根据方法签名返回值
     */
    public TargetImpl getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetImpl.class);
        enhancer.setCallback(this);
        return (TargetImpl) enhancer.create();
    }

    /**
     *
     *java 运行时生成 Bean
     */
    public Object get()
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BeanGenerator beanGenerator = new BeanGenerator();
        beanGenerator.addProperty("name", String.class);
        Object bean = beanGenerator.create();
        Method setName = bean.getClass().getMethod("setName", String.class);
        setName.invoke(bean, "steven");
        Method getName = bean.getClass().getMethod("getName");

       return getName.invoke(bean);
    }
}
