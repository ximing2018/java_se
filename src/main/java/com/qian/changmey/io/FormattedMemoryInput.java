package com.qian.changmey.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.io
 * @ClassName: FormattedMemoryInput
 * @Author: changmey
 * @Description: 格式化的内存输入
 * @Date: 2020/8/12 22:26
 * @Version: 1.0
 */
public class FormattedMemoryInput {

    public static void main(String[] args) throws IOException {

        List<Byte> read = read("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io\\BufferedReaderFile.java");

        read.forEach(System.out::println);
    }

    /**
     * @Author changmey
     * @Version  1.0
     * @Description  DataInputStream(ByteArrayInputStream(byte[]))
     * @Date 2020/8/12 22:27
     */
    public static List<Byte> read(String file) throws IOException {

        List<Byte> list = new LinkedList<>();
        ByteArrayInputStream in = new ByteArrayInputStream(((BufferedReaderFile.read(file).getBytes())));
        DataInputStream dataInputStream = new DataInputStream(in);

        byte c;
        try {
            while (true){
                c = dataInputStream.readByte();
//                System.out.println((char) c);
                list.add(c);
            }
        } catch (EOFException e) {
            e.printStackTrace();
            System.out.println("ending");
        }
        return list;
    }

}
