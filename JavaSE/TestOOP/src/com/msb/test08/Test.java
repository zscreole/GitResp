package com.msb.test08;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 15:24
 * @Description: com.msb.test08
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为p40",2030.2,2020);
        Phone p2 = new Phone("华为p40",2030.2,2020);

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        Cat c = new Cat();
        System.out.println(p1.equals(c));
    }
}
