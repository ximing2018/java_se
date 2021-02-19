package com.qian.changmey.util.tij4.gnrator.collection;


import java.util.HashSet;
import java.util.List;

/**
 * @author changmey
 * @date 2021/2/8 22:05
 */
public class CollectionDataGenerationTest {
    public static void main(String[] args) {

        List<String> list = CollectionData.list(new RandomGenerator.String(9), 10);
        System.out.println(list);

        System.out.println(new HashSet<>(new CollectionData<>(new CountingGenerator.Integer(), 10)));

        System.out.println(new HashSet<>(new CollectionData<>(new RandomGenerator.Integer(), 10)));
    }
}
