package com.qian.changmey.designpattern.strategy;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Processor
 * @Author: changmey
 * @Description: 策略模式 举例
 * @Date: 2021/1/21 22:54
 * @Version: 1.0
 */
class Processor {

    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}
