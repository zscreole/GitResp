package com.msb.io02;

import java.io.*;

/**
 * @author: Adam
 * @date: 2023/7/12 - 12:03
 * @description: com.msb.io02
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //序列化 将内存中对象 ---》 文件
        //有一个对象
        Person p = new Person("丽丽",19);

        //有对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("e:\\demo4.txt")));

        //向外写
        oos.writeObject(p);

        //关流
        oos.close();

    }
}
