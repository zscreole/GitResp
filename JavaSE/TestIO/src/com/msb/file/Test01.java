package com.msb.file;

import java.io.File;
import java.io.IOException;

/**
 * @author: Adam
 * @date: 2023/7/10 - 10:17
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("e:\\test.txt");
        File f1 = new File("e:/test.txt");
        File f2 = new File("e:"+File.separator+"test.txt");

        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println("文件的名字："+f.getName());
        System.out.println("文件的上级目录："+f.getParent());
        System.out.println("是否是目录："+f.isDirectory());
        System.out.println("是否是文件："+f.isFile());
        System.out.println("是否隐藏："+f.isHidden());
        System.out.println("文件的大小："+f.length());
        System.out.println("是否存在："+f.exists());
        /*if(f.exists()){
            f.delete();
        }else{
            f.createNewFile();
        }*/

        System.out.println(f==f1);
        System.out.println(f.equals(f1));

        System.out.println("绝对路径"+f.getAbsolutePath());
        System.out.println("相对路径"+f.getPath());
        System.out.println("toString"+f.toString());
    }
}
