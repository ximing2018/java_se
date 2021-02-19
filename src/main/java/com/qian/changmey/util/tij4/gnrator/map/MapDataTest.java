package com.qian.changmey.util.tij4.gnrator.map;

import com.qian.changmey.util.Print;
import com.qian.changmey.util.tij4.gnrator.Generator;
import com.qian.changmey.util.tij4.gnrator.collection.CountingGenerator;

import java.util.Iterator;

/**
 * @author changmey
 * @date 2021/2/11 10:36
 */
public class MapDataTest {
    public static void main(String[] args) {
//        Print.print(MapData.map(new Letters(),11));

//        Print.print(MapData.map(new Letters(),6));

//        Print.print(MapData.map(new CountingGenerator.Character(),new RandomGenerator.String(3),8));

        Print.print(MapData.map(new CountingGenerator.Character(),"AA",19));

    }


}

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer>{
    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number<size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
