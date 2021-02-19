package com.qian.changmey.Math;

import java.util.Random;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.Math
 * @ClassName: RandomTest
 * @Author: changmey
 * @Description:
 * @Date: 2020/10/1 10:38
 * @Version: 1.0
 */
public class RandomTest {


    public static void main(String[] args) {
        Random random = new Random(100);
        Random random2 = new Random(100);

        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10)+" ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(random2.nextInt(10)+" ");
        }
    }

}
