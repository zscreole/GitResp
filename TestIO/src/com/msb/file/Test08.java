package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/10 - 17:05
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        //1.有一个源图片
        File f1 = new File("e:\\a.jpg");
        //2.有一个目标图片
        File f2 = new File("e:\\b.jpg");
        //3.有个输入的管道怼到源文件上
        FileInputStream fis = new FileInputStream(f1);
        //4.有个输出的管道怼到目标文件上
        FileOutputStream fos = new FileOutputStream(f2);
        //5.开始复制
        /*int len = fis.read();
        while(len!=-1){
            fos.write(len);
            len = fis.read();
        }*/
        //利用缓存数组
        byte[] b = new byte[1024*6];
        int len = fis.read(b);
        while(len!=-1){
           fos.write(b,0,len);
           len = fis.read(b);
        }
        //6.关闭流
        fos.close();
        fis.close();
    }

}
