package com.qian.changmey.designpattern.strategy3;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Upcase
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 22:56
 * @Version: 1.0
 */
class Upcase extends StringProcessor{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
