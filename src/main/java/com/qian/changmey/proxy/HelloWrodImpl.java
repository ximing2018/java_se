package com.qian.changmey.proxy;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy
 * @ClassName: HelloWrodImpl
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/2 21:46
 * @Version: 1.0
 */
public class HelloWrodImpl implements HelloWord,HelloDay{
    @Override
    public void sayHelloWord(String s) {
        System.out.println("Hello 、 " + s);
    }

    @Override
    public void sayHelloDay(String s) {
        System.out.println("Hello day...");
    }
}
