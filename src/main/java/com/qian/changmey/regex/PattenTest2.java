package com.qian.changmey.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.regex
 * @ClassName: PattenTest
 * @Author: changmey
 * @Description:
 * @Date: 2020/12/30 6:47
 * @Version: 1.0
 */
public class PattenTest2 {

    public static void main(String[] args) {

        String s = "123java675java";
        String s2 = "123java675java";
        String pattern = "java";

        Pattern compile = Pattern.compile(pattern);
        String[] split = compile.split(s, 2);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        boolean matches = Pattern.matches(s2, s);
        System.out.println(matches);

    }
}
