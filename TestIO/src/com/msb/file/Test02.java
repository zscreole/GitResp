package com.msb.file;

import java.io.File;

/**
 * @author: Adam
 * @date: 2023/7/10 - 10:47
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File f = new File("E:\\mysql202204");

        File f2 = new File("E:\\a\\b\\c");
       // f2.mkdir();
        //f2.mkdirs();
       // f2.delete();

        String[] list = f.list();
        for(String s:list){
            System.out.println(s);
        }

        File[] files = f.listFiles();
        for(File file : files){
            System.out.println(file.getName()+file.getAbsolutePath());
        }
    }
}
