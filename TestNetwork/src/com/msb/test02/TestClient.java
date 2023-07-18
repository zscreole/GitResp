package com.msb.test02;

import java.io.*;
import java.net.Socket;

/**
 * @author: Adam
 * @date: 2023/7/13 - 10:05
 * @description: com.msb.test02
 * @version: 1.0
 */
public class TestClient {//客户端
    public static void main(String[] args) throws IOException {
        //1.创建套接字：指定服务器的ip和端口号
        Socket s =new Socket("192.168.1.23",8888);
        //2.对于程序员来说，向外发送数据 ---》输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好");

        //接收服务器的回话 ---》利用输入流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器对我说"+str);
        //3.关闭流
        dos.close();
        s.close();
    }
}
