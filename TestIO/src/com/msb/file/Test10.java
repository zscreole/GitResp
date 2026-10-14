package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/11 - 13:38
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        //1.有一个源图片
        File f1 = new File("e:\\a.jpg");
        //2.有一个目标图片
        File f2 = new File("e:\\b.jpg");
        //3.有个输入的管道怼到源文件上
        FileInputStream fis = new FileInputStream(f1);
        //4.有个输出的管道怼到目标文件上
        FileOutputStream fos = new FileOutputStream(f2);
        //5.加强输入流
        BufferedInputStream bis = new BufferedInputStream(fis);
        //6.加强输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //7.操作
        byte[] b = new byte[1024*6];

        int len = bis.read(b);

        while(len!=-1){
            bos.write(b,0,len);
            len = bis.read(b);
        }
        bos.close();
        bis.close();
    }
}
