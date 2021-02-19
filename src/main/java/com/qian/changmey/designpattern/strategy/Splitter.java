package com.qian.changmey.designpattern.strategy;

import java.util.Arrays;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: Splitter
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 23:00
 * @Version: 1.0
 */
class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
