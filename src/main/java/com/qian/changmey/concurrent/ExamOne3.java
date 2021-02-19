package com.qian.changmey.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.concurrent
 * @ClassName: ExamOne3
 * @Author: changmey
 * @Description: countDownLantch
 * @Date: 2020/12/4 7:18
 * @Version: 1.0
 */
public class ExamOne3 {

    public static void main(String[] args) {

        Object obj = new Object();
        container container = new container();
        CountDownLatch downLatch = new CountDownLatch(1);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    container.add(i);
                    if (container.getSize()==5){
                        downLatch.countDown();
                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
                System.out.println(Thread.currentThread().getName()+"：结束");
            }
        }, "线程1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    downLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"：已经5个元素啦~~~");
                System.out.println(Thread.currentThread().getName()+"：结束");
            }
        }, "线程2");


        thread1.start();
        thread2.start();

    }



}
class container2{
    private List<Object> tmp = new ArrayList<>(10);

    public void add(){
        tmp.add(new Object());
        System.out.println("添加一个元素");
    }

    public Integer getSize(){
        return tmp.size();
    }
}


