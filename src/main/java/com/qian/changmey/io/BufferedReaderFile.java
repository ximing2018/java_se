package com.qian.changmey.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class BufferedReaderFile {


    public static void main(String[] args) throws IOException {
//        System.out.println(read("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io\\BufferedReaderFile.java"));
        System.out.println(readLinkedList("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io\\BufferedReaderFile.java"));
    }

     static String read(String file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));

        StringBuilder stringBuffer = new StringBuilder();
        String str;
        while ((str = in.readLine()) != null){
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
        in.close();
        return stringBuffer.toString();
    }

    static String readLinkedList(String file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        LinkedList<String> list = new LinkedList<>();
        String s;
        while ((s=in.readLine())!=null){
            list.add(s);
        }
        while (list.peekLast() != null){
            sb.append(list.pollLast());
            sb.append("\n");
        }
        return sb.toString();
    }
}
