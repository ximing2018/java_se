package com.qian.changmey.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {

    public static void main(final String[] args) {
        File file = new File(".");

        String[] list = file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(args[0]);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s :list) {
            System.out.println(s);
        }
    }
}
