package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/11 - 14:48
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("e:\\test.txt");
        //2.有一个目标文件
        File f2 = new File("e:\\demo.txt");
        //3.有一根管怼到源文件上
        FileReader fr = new FileReader(f1);
        //4.有一根管怼到目标文件上
        FileWriter fw = new FileWriter(f2);
        //5.有一根管套在输入字符流上面
        BufferedReader br = new BufferedReader(fr);
        //6.有一根管套在输出字符流上面
        BufferedWriter bw = new BufferedWriter(fw);
        //7.开始复制
        //方式1:
        /*int n = br.read();
        while(n!=-1){
            bw.write(n);
            n = br.read();
        }*/

        //方式2：
        /*char[] ch = new char[30];
        int len = br.read(ch);
        while(len!=-1){
            bw.write(ch,0,len);
            len = br.read(ch);
        }*/

        //方式3:
        String s = br.readLine();
        while(s!=null){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        //8.关闭流
        bw.close();
        br.close();
    }
}
