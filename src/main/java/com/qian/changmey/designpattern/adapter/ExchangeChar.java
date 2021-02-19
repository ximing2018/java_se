package com.qian.changmey.designpattern.adapter;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy3
 * @ClassName: ExchangeChar
 * @Author: changmey
 * @Description: 互换每对字符串
 * @Date: 2021/1/23 11:59
 * @Version: 1.0
 */
public class ExchangeChar {
    public Object process(String input) {
        char[] chars = input.toCharArray();
        int lz = chars.length;
        char[] temp = new char[lz];
        for (int i = 0; i < lz; i++) {
            if (i==lz-1){
                temp[i]=chars[i];
            }else {
                temp[i]=chars[i+1];
                temp[i+1]=chars[i];
            }
            i++;
        }
        String retunStr = new String(temp);
        System.out.println("互换字符串。。。" + retunStr);
        return retunStr;
    }
}
