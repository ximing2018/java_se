package com.qian.changmey.designpattern.strategy2;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.strategy
 * @ClassName: WaveFrom
 * @Author: changmey
 * @Description: 电子滤波器
 * @Date: 2021/1/21 23:14
 * @Version: 1.0
 */
public class WaveFrom {
    private static long counter;
    private final long id= counter++;

    public String toString(){
        return "Waveform " + id;}
}
