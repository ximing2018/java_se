package com.qian.changmey.io;

import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.io
 * @ClassName: BufferedReaderFile2
 * @Author: changmey
 * @Description: 读取文件，所以内容小写转大写
 * @Date: 2020/8/12 21:22
 * @Version: 1.0
 */
public class BufferedReaderFile2 {

    public static void main(String[] args) throws IOException {

        read("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io\\BufferedReaderFile.java");

    }

    /**
     * @Author changmey
     * @Version  1.0
     * @Description
     * @Date 2020/8/12 21:48
     */
    public static List<String> read(String file) throws IOException {

        if (StringUtils.isEmpty(file)){
            return null;
        }
        List<String> list = new ArrayList<>(160);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String tmp;
        while ((tmp = in.readLine()) != null){
            list.add(tmp.toUpperCase());
        }
        if (list.size()>0){
            list.forEach(System.out::println);
        }
        return list;
    }
}
