package edu.seu.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 动态代理工厂
public class ProxyFactory {

    private Object target;

    // 构造器

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance() {

        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *     loader: 指定当前目标对象所使用的类加载器，获取加载器的方法固定
         *     interfaces： 目标对象实现的接口类型，使用范型方法确认类型
         *     h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行的目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 增强方法
                        System.out.println("JDK代理开始");
                        // 通过反射机制调用目标方法，返回执行结果
                        return method.invoke(target, args);
                    }
                });
    }
}
