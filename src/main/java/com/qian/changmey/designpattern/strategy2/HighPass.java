package com.qian.changmey.designpattern.strategy2;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy2
 * @ClassName: LowPass
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/21 23:19
 * @Version: 1.0
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff=cutoff;
    }

    public WaveFrom process(WaveFrom input){
        return input;
    }
}
