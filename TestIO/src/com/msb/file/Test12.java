package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/11 - 16:46
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        //1.源文件
        File f1 = new File("e:\\test.txt");
        //2.目标文件
        File f2 = new File("e:\\demo.txt");
        //3.输入字节流
        FileInputStream fis = new FileInputStream(f1);
        //4.输入字符流
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //5.处理
        char[] ch =new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }
        //关流
        isr.close();
    }
}
