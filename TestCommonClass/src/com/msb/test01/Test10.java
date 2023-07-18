package com.msb.test01;

import java.util.Random;

/**
 * @Auther: Adam
 * @Date: 2023/7/4 - 10:01
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
        System.out.println(Math.random());

        //有参构造器
        Random r1 = new Random(System.currentTimeMillis());
        int i = r1.nextInt();
        System.out.println(i);

        //无参
        Random r2 = new Random();
        System.out.println(r2.nextInt(10));
        System.out.println(r2.nextDouble());
    }
}
