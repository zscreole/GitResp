package com.msb.file;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 10:42
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test15 {
    public static void main(String[] args) throws IOException {
        //1.先准备输入方向
        //键盘录入
        InputStream in = System.in;//属于字节流
        //字节流 ---》字符流
        InputStreamReader isr = new InputStreamReader(in);
        //在isr上面套一个缓冲流
        BufferedReader br = new BufferedReader(isr);

        //2.再准备输出方向
        //准备目标文件
        File f = new File("e:\\demo1.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        //3.开始动作
        String s = br.readLine();
        while(!s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }

        //4.关闭流
        bw.close();
        br.close();
    }
}
