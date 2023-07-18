package com.msb.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Adam
 * @date: 2023/7/10 - 16:49
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f = new File("e:\\a.jpg");
        //2.有一根字符流的管怼上去
        FileInputStream fis = new FileInputStream(f);
        //3.开始操作
        /*int count = 0;
        int len = fis.read();
        while(len!=-1){
            count++;
            System.out.println(len);
            len = fis.read();
        }
        System.out.println("count="+count);*/

        //利用缓冲数组
        byte[] b = new byte[1024*6];
        int len = fis.read(b);
        while(len!=-1){
            //System.out.println(len);
            for(int i=0;i<len;i++){
                System.out.println(b[i]);
            }
            len = fis.read(b);
        }
        //4.关闭流
        fis.close();
    }
}
