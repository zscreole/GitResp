package com.msb.test03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Adam
 * @date: 2023/7/13 - 10:15
 * @description: com.msb.test02
 * @version: 1.0
 */
public class TestServer {//服务器
    public static void main(String[] args)  {
        //1.创建套接字 指定服务器的端口号
        System.out.println("服务器启动了");
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;//定义一个计算器，用来计算客户端的请求
        try {
            ss = new ServerSocket(8888);
            //2.等着客户端发来的信息
            while(true){//加入死循环，服务器一直监听客户端
                s = ss.accept();//阻塞方法：等待接收客户端的数据
                //每次过来的客户端请求呀靠一个线程来处理
                new ServerThread(s).start();
                count++;
                System.out.println("当前是第"+count+"个用户访问我们的服务器"+s.getInetAddress());
            }

            //3.感受到操作流

        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}

