package com.msb.io02;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 12:08
 * @description: com.msb.io02
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("e:\\demo4.txt")));

        //读入内存
        Person p =(Person) (ois.readObject());
        System.out.println(p);

        //关闭流
        ois.close();
    }
}
