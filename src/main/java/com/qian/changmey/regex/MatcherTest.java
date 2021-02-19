package com.qian.changmey.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.regex
 * @ClassName: MatcherTest
 * @Author: changmey
 * @Description:
 * @Date: 2020/12/31 5:58
 * @Version: 1.0
 */
public class MatcherTest {

    public static void main(String[] args) {

        String s = "123java675java";
        String s2 = "java675";
        String pattern = "java";

        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(s2);

//        boolean matches = matcher.matches();
//        System.out.println(matches);
//
//        boolean b = matcher.lookingAt();
//        System.out.println(b);
//
//        boolean b1 = matcher.find();
//        System.out.println(b1);


        boolean b = matcher.find();
        int start = matcher.start();
        int end = matcher.end();
        String group = matcher.group();
        System.out.println(b);
        System.out.println(start);
        System.out.println(end);
        System.out.println(group);

        boolean b1 = matcher.find();
        System.out.println(b1);
        System.out.println(matcher.group());
    }
}
