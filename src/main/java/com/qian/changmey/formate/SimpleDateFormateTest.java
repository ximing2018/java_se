package com.qian.changmey.formate;

import java.text.ParseException;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.executor
 * @ClassName: SimpleDateFormateTest
 * @Author: changmey
 * @Description: 测试
 * @Date: 2020/10/1 8:27
 * @Version: 1.0
 */
public class SimpleDateFormateTest {


    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            SimpleDateFormatThread thread = new SimpleDateFormatThread(String.valueOf(i), "2018-11-03 10:02:47");
            thread.start();
        }
    }
}

class SimpleDateFormatThread extends Thread {
    private String dateStr;

    SimpleDateFormatThread(String name, String dateStr) {
        super(name);
        this.dateStr = dateStr;
    }

    public void run(){

        try {
            DateUtil.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
