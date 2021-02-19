package com.qian.changmey.proxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.interceptor
 * @ClassName: MyInterceptor
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 13:49
 * @Version: 1.0
 */
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前逻辑");
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        String name = method.getName();
        System.out.println("method = " + name);
        System.out.println("取代了被代理对象的方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑");
    }
}
