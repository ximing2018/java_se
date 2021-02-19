package com.qian.changmey.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.jdk.cglib
 * @ClassName: CglibProxyExample
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 10:10
 * @Version: 1.0
 */
public class CglibProxyExample implements MethodInterceptor {

    public Object getProxy(Class cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理前..");
        Object o = methodProxy.invokeSuper(target, objects);
        System.out.println("代理后..");
        return o;
    }
}
