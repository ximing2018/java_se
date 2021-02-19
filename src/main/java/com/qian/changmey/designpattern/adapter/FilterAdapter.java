package com.qian.changmey.designpattern.adapter;

import com.qian.changmey.designpattern.strategy2.Filter;
import com.qian.changmey.designpattern.strategy2.WaveFrom;
import com.qian.changmey.designpattern.strategy3.Processor;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.designpattern.adapter
 * @ClassName: FilterAdapter
 * @Author: changmey
 * @Description: 适配器
 * @Date: 2021/1/23 10:29
 * @Version: 1.0
 */
public class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public FilterAdapter() {
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((WaveFrom) input);
    }
}
