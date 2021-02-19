package com.qian.changmey.util.tij4.gnrator.collection;


import com.qian.changmey.util.tij4.gnrator.Generator;

import java.util.Random;

/**
 * @author changmey
 * @date 2021/2/8 21:48
 */
public class RandomGenerator {
    private static Random r = new Random(47);

    public static class Bolean implements Generator<Boolean> {
        @Override
        public Boolean next() {
            return r.nextBoolean();
        }
    }

    public static class Integer implements Generator<java.lang.Integer>{
        private int mod = 10000;
        public Integer(){}
        public Integer(int modulo){mod = modulo;}
        @Override
        public java.lang.Integer next() {
            return r.nextInt(mod);
        }
    }

    public static class Character implements Generator<java.lang.Character> {
        public java.lang.Character next() {
            return CountingGenerator.chars[
                    r.nextInt(CountingGenerator.chars.length)];
        }
    }

    public static class String extends CountingGenerator.String{
        {
            cg = new Character();
        }
        public String(){}
        public String(int length){
            super(length);
            System.out.println("设置字符串长度");
        }
    }

}
