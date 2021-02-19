package com.qian.changmey.io;

import com.qian.changmey.util.tij4.TextFile;

import java.io.File;
/**
 * word
 */
public class DirList4 {

    public static void main(final String[] args) {

        File file = new File("E:\\IdeaProjects\\t_javase\\src\\main\\java\\com\\qian\\changmey\\io");
        String[] list = file.list((dir, name) -> {

            System.out.println(dir.getAbsoluteFile() + "--" + name);

            TextFile textFile = new TextFile(new File(dir.getAbsolutePath(),name).getAbsolutePath());
            for (String text:textFile) {
                System.out.println("text--" + text);
                boolean contains = text.contains(args[0]);
                if (contains){
                    return Boolean.TRUE;
                }
            }
            return false;
        });
        System.out.println("文件数量：" + list.length);
    }
}
