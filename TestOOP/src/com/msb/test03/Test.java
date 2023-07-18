package com.msb.test03;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 10:16
 * @Description: com.msb.test03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.setSno(1001);
        s.setAge(18);
        s.setName("丽丽");
        s.setHeight(170.4);

        System.out.println("我叫"+s.getName()+",今年"+s.getAge());

        s.eat();
        s.sleep();
        s.study();
    }
}
