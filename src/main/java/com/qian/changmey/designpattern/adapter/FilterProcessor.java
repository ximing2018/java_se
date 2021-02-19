package com.qian.changmey.designpattern.adapter;

import com.qian.changmey.designpattern.strategy2.BandPass;
import com.qian.changmey.designpattern.strategy2.HighPass;
import com.qian.changmey.designpattern.strategy2.LowPass;
import com.qian.changmey.designpattern.strategy2.WaveFrom;
import com.qian.changmey.designpattern.strategy3.Apply;
import com.qian.changmey.designpattern.strategy3.Downcase;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.adapter
 * @ClassName: FilterProcessor
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/23 10:35
 * @Version: 1.0
 */
public class FilterProcessor {
    public static void main(String[] args) {
//        WaveFrom waveFrom = new WaveFrom();
//        Apply.process(new FilterAdapter(new LowPass(1.0)), waveFrom);
//        Apply.process(new FilterAdapter(new HighPass(2.0)), waveFrom);
//        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), waveFrom);

//        Apply.process(new Downcase(),Apply.s);


        Apply.process(new ExchangeCharAdapter(new ExchangeChar()),"zha");

    }
}
