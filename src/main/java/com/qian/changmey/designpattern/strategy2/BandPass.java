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
public class BandPass extends Filter {
    double lowCutoff,highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public WaveFrom process(WaveFrom input){
        System.out.println("BandPass 业务。。。");
        return input;
    }
}
