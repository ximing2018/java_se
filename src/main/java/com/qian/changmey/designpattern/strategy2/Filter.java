package com.qian.changmey.designpattern.strategy2;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy2
 * @ClassName: Filter
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 23:18
 * @Version: 1.0
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public WaveFrom process(WaveFrom input){
        System.out.println("加业务。。。。");
        return input;
    }
}
