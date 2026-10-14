package com.msb.test04;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author: Adam
 * @date: 2023/7/13 - 15:29
 * @description: com.msb.test04
 * @version: 1.0
 */
public class TestSend {//发送方

    public static void main(String[] args)  {
        System.out.println("学生上线。。。");
        //1.准备套接字:指定发送方的端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            //2.准备数据包
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.print("学生：");
                String str = sc.next();

                byte[] bytes = str.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);
                //发送
                ds.send(dp);
                if(str.equals("byebye")){
                    System.out.println("学生下线。。。");
                    break;
                }

                //接受老师发送回来的信息
                byte[] b = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(b,b.length);
                //3.接收对方的数据包，然后放入dp数据包中填充
                ds.receive(dp2);

                //4.取出数据
                byte[] data = dp2.getData();
                String s = new String(data,0,dp2.getLength());
                System.out.println("老师对我说："+s);
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //关闭资源
            ds.close();
        }
    }
}
