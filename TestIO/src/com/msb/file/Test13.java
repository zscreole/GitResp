package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/11 - 17:04
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test13 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("e:\\test.txt");
        //2.有一个目标文件
        File f2 = new File("e:\\demo.txt");
        //3.输入方向
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //4.输出方向
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        //5.开始动作
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            osw.write(ch,0,len);
            len = isr.read(ch);
        }
        //6.关闭流
        osw.close();
        isr.close();
    }
}
