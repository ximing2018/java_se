package com.qian.changmey.designpattern.strategy3;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Apply
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 23:02
 * @Version: 1.0
 */
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("使用策略：" + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
