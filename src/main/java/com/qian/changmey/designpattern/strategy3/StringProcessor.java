package com.qian.changmey.designpattern.strategy3;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy3
 * @ClassName: StringProcessor
 * @Author: changmey
 * @Description: 客戶端程序員遵循接口来编写自己的类
 * @Date: 2021/1/21 23:30
 * @Version: 1.0
 */
public abstract class StringProcessor implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input) ;
}
