package com.msb.test02;

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
    public static void main(String[] args) throws IOException {
        //1.创建套接字 指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);
        //2.等着客户端发来的信息
        Socket s = ss.accept();//阻塞方法：等待接收客户端的数据
        //3.感受到操作流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //4.读取客户端的数据
        String str = dis.readUTF();
        System.out.println("客户端发来数据为："+str);

        //向客户端输出一句话 ---》操作输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，我是服务器，我接收到你的请求了");

        //5.关闭流
        dos.close();
        dis.close();
        s.close();
        ss.close();

    }
}
