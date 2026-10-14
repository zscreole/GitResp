package com.msb.test06;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 13:48
 * @Description: com.msb.test06
 * @version: 1.0
 */
public class Student extends Person {
    double height;
    double weight;

    public Student() {
    }

    public Student(int age, String name, double height, double weight) {
        super(age, name);
        this.height = height;
        this.weight = weight;
    }
}
