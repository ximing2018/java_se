package com.qian.changmey.designpattern.adapter;

import com.qian.changmey.designpattern.strategy3.Processor;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.adapter
 * @ClassName: ExchangeCharAdapter
 * @Author: changmey
 * @Description: 互换字符串适配器
 * @Date: 2021/1/23 12:03
 * @Version: 1.0
 */
public class ExchangeCharAdapter implements Processor {
    private ExchangeChar exchangeChar;

    public ExchangeCharAdapter(ExchangeChar exchangeChar) {
        this.exchangeChar = exchangeChar;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return exchangeChar.process((String) input);
    }
}
