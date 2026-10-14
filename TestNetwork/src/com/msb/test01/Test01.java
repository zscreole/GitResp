package com.msb.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: Adam
 * @date: 2023/7/12 - 16:12
 * @description: com.msb.test01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        //封装IP
        //InetAddress ia = new InetAddress();
        InetAddress ia = InetAddress.getByName("192.168.1.23");
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost");
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("DESKTOP-VPLKOB3");
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia5);

        System.out.println(ia5.getHostName());
        System.out.println(ia5.getHostAddress());
    }
}
