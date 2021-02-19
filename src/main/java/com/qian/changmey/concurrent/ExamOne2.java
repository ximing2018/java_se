package com.qian.changmey.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.concurrent
 * @ClassName: ExamOne
 * @Author: changmey
 * @Description:
 * @Date: 2020/12/2 7:27
 * @Version: 1.0
 */
public class ExamOne2 {
/**
 * taobao examination
 * 实现一个容器，提供两个方法，add和size
 * 写两个线程，线程1添加10个元素到容器中，
 * 线程2实现监控元素的个数，当个数到5个时，
 * 线程2给出提示并结束
 *
 * 这里使用wait()和notify()方法实现，
 * 注意：wait()会释放锁，而nodify()不会释放锁。
 */

static List<Integer> tmp = new ArrayList<>(10);

public static void main(String[] args) {

    final Object obj = new Object();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (obj){
                System.out.println("t1线程开始执行：");
                try {
                    for (int i = 0; i <10 ; i++) {
                        tmp.add(i);
                        System.out.println("添加元素："+i);
                        if (tmp.size()==5){
                            obj.notify();
                            obj.wait();
                        }
//                        Thread.sleep(1000);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("t1线程结束！");
        }
    });

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (obj){
                System.out.println("t2线程开始执行：");
                try {
                    if (tmp.size() != 5) {
                        obj.wait();
                        obj.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("已经五个元素啦~~");
            }
            System.out.println("t2线程结束");
        }
    });

    t2.start();
    t1.start();

}
 }

