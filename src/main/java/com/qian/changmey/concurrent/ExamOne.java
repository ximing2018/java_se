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
public class ExamOne {
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

public static void main(String[] args) {
    container container = new container();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                container.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            container.getSize();
        }
    });

    t1.start();
    t2.start();

}
 }

 class container{
     public List<Integer> tmp = new ArrayList<>(10);

     public void add(Integer i){
         tmp.add(i);
         System.out.println("添加元素："+i);
     }

     public Integer getSize(){
         return tmp.size();
     }
 }
