package com.qian.changmey.io;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.io
 * @ClassName: MemoryInput
 * @Author: changmey
 * @Description: 从内存输入
 * @Date: 2020/8/12 22:11
 * @Version: 1.0
 */
public class MemoryInput {

    public static void main(String[] args) throws IOException {
        List<Character> list = read("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io\\BufferedReaderFile.java");
        list.forEach(System.out::println);
        System.out.println("list.size = " + list.size());
    }

    public static List<Character> read(String str) throws IOException {
        List<Character> list = new ArrayList<>();
        StringReader in = new StringReader(BufferedReaderFile.read(str));
        int c;
        while ((c=in.read()) != -1){
            Character tmp = (char) c;
            Character blank = ' ';
            if (!blank.equals(tmp)){
                list.add((char) c);
            }

        }
        return list;
    }

}
