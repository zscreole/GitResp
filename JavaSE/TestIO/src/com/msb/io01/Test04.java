package com.msb.io01;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 11:38
 * @description: com.msb.io01
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("e:\\demo3.txt")));

        String s = (String)(ois.readObject());

        System.out.println(s);

        ois.close();
    }
}
