package com.qian.changmey.proxy.interceptor;

import com.qian.changmey.proxy.HelloWord;
import com.qian.changmey.proxy.HelloWrodImpl;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.interceptor
 * @ClassName: Test
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 14:13
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        HelloWord proxy = (HelloWord)InterceptorJdkProxy.getProxy(new HelloWrodImpl(),
                "com.qian.changmey.proxy.interceptor.MyInterceptor");

        proxy.sayHelloWord("西塞罗");
    }
}
