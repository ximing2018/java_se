package com.qian.changmey.designpattern.strategy3;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Downcase
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 22:58
 * @Version: 1.0
 */
public class Downcase extends StringProcessor {
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
