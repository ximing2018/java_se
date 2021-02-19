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
public class PattenTest {

    public static void main(String[] args) {

        String s = "123java675java";
        String PATTERN = "#\\{[A-Za-z0-9]+}";

        String sql = "INSERT INTO person(name,age) VALUES (#{name},#{age})";

        Pattern pattern = Pattern.compile(PATTERN);
        System.out.println(pattern);

        Matcher matcher = pattern.matcher(sql);
        matcher.find();
        String group = matcher.group();
        System.out.println(group);
        matcher.find();
        String group2 = matcher.group();
        System.out.println(group2);


    }
}
