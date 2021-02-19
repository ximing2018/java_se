package com.qian.changmey.util.tij4.gnrator.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author changmey
 * @date 2021/2/8 21:37
 */
public class CollectionDataTest {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 15));

//        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
