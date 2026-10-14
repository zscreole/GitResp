package com.msb.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author: Adam
 * @date: 2023/7/12 - 16:24
 * @description: com.msb.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress isa =new InetSocketAddress("192.168.1.23",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
