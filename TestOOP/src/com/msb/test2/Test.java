package com.msb.test2;

/**
 * @Auther: Adam
 * @Date: 2023/6/27 - 17:22
 * @Description: com.msb.test2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("娜娜");
        s1.setAge(18);
        s1.setSex("女");
        System.out.println(s1.getName()+"---"+s1.getAge()+"---"+s1.getSex());

        Student s2 = new Student(17,"菲菲","ddd");
        System.out.println(s2.getName()+"---"+s2.getAge()+"---"+s2.getSex());
    }
}
