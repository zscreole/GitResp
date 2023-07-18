package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/10 - 16:09
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test09 {
    public static void main(String[] args)  {
        //1.有个源文件
        File f1 = new File("e:\\test.txt");
        //2.有一个目标文件
        File f2 = new File("e:\\demo.txt");
        //3.搞一个输入的管怼到源文件上
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);

            char[] ch = new char[5];
            int n = fr.read(ch);
            while(n!=-1){
                String s = new String(ch,0,n);
                fw.write(s);
                n = fr.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fw!=null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //4.搞一个输出的管怼到目标文件上



        //5.开始动作
        //方式1：一个字符一个字符的复制
        /*int len = fr.read();
        while(len!=-1){
            fw.write(len);
            len = fr.read();
        }*/

        //方式2：利用缓存数组
        /*char[] ch = new char[5];
        int n = fr.read(ch);
        while(n!=-1){
            fw.write(ch,0,n);
            n = fr.read(ch);
        }*/

        //方式3：利用字符串数组


        //6.关闭流

    }
}
