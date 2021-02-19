package com.qian.changmey.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

    public static void main(String[] args) {
        File file = new File(".");

        String[] list = file.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s :list) {
            System.out.println(s);
        }
    }
}
class DirFilter implements FilenameFilter{
    Pattern pattern ;

    public DirFilter(String pattern){
        this.pattern = Pattern.compile(pattern);
    }
    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}