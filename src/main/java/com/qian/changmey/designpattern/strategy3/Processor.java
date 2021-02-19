package com.qian.changmey.designpattern.strategy3;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Processor
 * @Author: changmey
 * @Description: 策略模式 举例
 * @Date: 2021/1/21 22:54
 * @Version: 1.0
 */
public interface Processor {
    String name();
    Object process(Object input);
}
