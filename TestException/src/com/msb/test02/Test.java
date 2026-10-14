package com.msb.test02;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 17:26
 * @Description: com.msb.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("菲菲",19,"dfda");

        s.setName("丽丽");
        s.setAge(21);
        try {
            s.setSex("女");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println(s2);
    }

}
