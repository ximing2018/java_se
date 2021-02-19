package com.qian.changmey.util.tij4.gnrator.collection;


import com.qian.changmey.util.tij4.gnrator.Generator;

import java.util.ArrayList;

/**
 * @author changmey
 * @date 2021/2/8 8:22
 */
public class CollectionData<T> extends ArrayList<T> {


    public CollectionData (Generator<T> gen, int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<>(gen, quantity);
    }
}
