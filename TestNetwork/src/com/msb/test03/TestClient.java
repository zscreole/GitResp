package com.msb.test03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: Adam
 * @date: 2023/7/13 - 10:05
 * @description: com.msb.test02
 * @version: 1.0
 */
public class TestClient {//客户端
    public static void main(String[] args)  {
        //1.创建套接字：指定服务器的ip和端口号
        System.out.println("客户端启动了");
        Socket s = null;
        DataInputStream dis = null;
        ObjectOutputStream oos = null;

        try {
            s = new Socket("192.168.1.23",8888);
            //录入用户的账号和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入您的账号：");
            String name = sc.next();
            System.out.println("请录入您的密码：");
            String pwd = sc.next();
            //将账号和密码封装成一个User对象
            User user = new User(name,pwd);

            //2.对于程序员来说，向外发送数据 ---》输出流
            OutputStream os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(user) ;

            //接收服务器的回话 ---》利用输入流
            InputStream is = s.getInputStream();
            dis = new DataInputStream(is);
            boolean b = dis.readBoolean();
            if(b){
                System.out.println("恭喜，登录成功");
            }else{
                System.out.println("对不起，登录失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //3.关闭流
            try {
                if(dis!=null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(oos!=null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(s!=null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
