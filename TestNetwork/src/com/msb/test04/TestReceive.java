package com.msb.test04;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author: Adam
 * @date: 2023/7/13 - 15:39
 * @description: com.msb.test04
 * @version: 1.0
 */
public class TestReceive {
    public static void main(String[] args)  {
        System.out.println("老师上线了。。。");
        //1.创建套接字,指定接收方的端口
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            while(true){
                //2.有一个空的数据包
                byte[] b = new byte[1024];
                DatagramPacket dp = new DatagramPacket(b,b.length);
                //3.接收对方的数据包，然后放入dp数据包中填充
                ds.receive(dp);

                //4.取出数据
                byte[] data = dp.getData();
                String s = new String(data,0,dp.getLength());
                System.out.println("学生对我说："+s);

                if(s.equals("byebye")){
                    System.out.println("学生已经下线了，老师也下线");
                    break;
                }

                //老师进行回复
                Scanner sc = new Scanner(System.in);
                System.out.print("老师：");
                String str = sc.next();
                byte[] bytes = str.getBytes();
                DatagramPacket dp2 = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),8888);
                //发送
                ds.send(dp2);
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //5.关闭资源
            ds.close();
        }

    }
}
