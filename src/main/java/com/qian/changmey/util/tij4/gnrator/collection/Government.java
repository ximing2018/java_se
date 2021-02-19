package com.qian.changmey.util.tij4.gnrator.collection;


import com.qian.changmey.util.tij4.gnrator.Generator;

/**
 * @author changmey
 * @date 2021/2/8 21:31
 */
public class Government implements Generator {
    private int index;
    String[] foundation = "strange women lying in ponds distributing swords is no basis for a system of government".split(" ");
    @Override
    public String next() {
        return foundation[index++];

    }
}
