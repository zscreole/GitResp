package com.msb.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Adam
 * @date: 2023/7/10 - 15:03
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //1.有一个目标文件
       File f = new File("e:/demo.txt");
        //2.FileWriter
        FileWriter fw = new FileWriter(f);
        //3.开始输出
        String str = "hello你好";
        char[] ch= str.toCharArray();
        /*for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }*/
        fw.write(ch);
        //4.关闭
        fw.close();
    }

}
