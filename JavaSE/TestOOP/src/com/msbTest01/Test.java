package com.msbTest01;

/**
 * @Auther: Adam
 * @Date: 2023/6/27 - 16:54
 * @Description: com.msbTest01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
//        g.age = 18;
//        System.out.println(g.age);
        g.setAge(31);
        System.out.println(g.getAge());
    }
}
