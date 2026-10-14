package com.msb.io01;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 11:11
 * @description: com.msb.io01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        /*File f = new File("e:\\demo2.txt");
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);*/
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("e:\\demo2.txt")));

        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());

        dis.close();

    }
}
