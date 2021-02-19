package com.qian.changmey.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy
 * @ClassName: JdkProxyExample
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/2 21:47
 * @Version: 1.0
 */
public class JdkProxyExample implements InvocationHandler{


    private Object target = null;

    public Object bind (Object o){
        this.target = o;
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("反射开始...");
        Object invoke = method.invoke(target, args);
        System.out.println("反射结束。。。");
        return invoke;
    }
}
