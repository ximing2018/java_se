package com.qian.changmey.proxy.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.interceptor
 * @ClassName: InterceptorJdkProxy
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 13:58
 * @Version: 1.0
 */
public class InterceptorJdkProxy implements InvocationHandler  {

    private Object target=null;
    private String interceptorClass = null;


    public InterceptorJdkProxy(Object target,String interceptorClass){
        this.target= target;
        this.interceptorClass=interceptorClass;
    }


    public static Object getProxy(Object target, String interceptorClass){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target,interceptorClass));
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (interceptorClass == null) {
            return method.invoke(proxy,args);
        }
        Object result = null;
        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();

        if (interceptor.before(proxy, target, method, args)) {
            result = method.invoke(target,args);
        }else {
            interceptor.around(proxy, target,method,args);
            result = method.invoke(target,args);
        }
        interceptor.after(proxy,target,method,args);
        return result;
    }
}
