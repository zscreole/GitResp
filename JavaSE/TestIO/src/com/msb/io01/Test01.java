package com.msb.io01;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 11:07
 * @description: com.msb.io01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("e:\\demo2.txt")));

        dos.writeUTF("你好");
        dos.writeBoolean(false);
        dos.writeDouble(4.5);
        dos.writeInt(23);

        dos.close();
    }
}
