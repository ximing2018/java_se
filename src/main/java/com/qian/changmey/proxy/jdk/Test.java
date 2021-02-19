package com.qian.changmey.proxy.jdk;

import com.qian.changmey.proxy.HelloWord;
import com.qian.changmey.proxy.HelloWrodImpl;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy
 * @ClassName: Test
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/2 21:52
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        HelloWord bind = (HelloWord)jdkProxyExample.bind(new HelloWrodImpl());
        bind.sayHelloWord("zhangsan");

    }

}
