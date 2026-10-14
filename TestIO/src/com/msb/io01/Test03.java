package com.msb.io01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author: Adam
 * @date: 2023/7/12 - 11:36
 * @description: com.msb.io01
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("e:\\demo3.txt")));

        oos.writeObject("你好");

        oos.close();
    }
}
