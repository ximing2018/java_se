package com.qian.changmey.proxy.jdk;

import com.qian.changmey.proxy.HelloWord;
import com.qian.changmey.proxy.HelloWrodImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy
 * @ClassName: Test2
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 9:22
 * @Version: 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        HelloWrodImpl target = new HelloWrodImpl();

        HelloWord proxyInstance = (HelloWord)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始。。。");
                Object invoke = method.invoke(target, args);
                System.out.println("结束。。。");
                return invoke;
            }
        });
        proxyInstance.sayHelloWord("zs");
    }
}
