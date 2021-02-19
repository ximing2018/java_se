package com.qian.changmey.proxy.cglib;

import com.qian.changmey.proxy.HelloWrodImpl;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.cglib
 * @ClassName: Test
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 10:21
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        CglibProxyExample cglibProxyExample = new CglibProxyExample();
        HelloWrodImpl proxy = (HelloWrodImpl)cglibProxyExample.getProxy(HelloWrodImpl.class);

        proxy.sayHelloWord("弗洛姆");

    }
}
