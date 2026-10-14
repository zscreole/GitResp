package com.msb.io02;

import java.io.Serializable;

/**
 * @author: Adam
 * @date: 2023/7/12 - 12:01
 * @description: com.msb.io02
 * @version: 1.0
 */
public class Person implements Serializable {

    //属性
    private static final long serialVersionUID = -6730750775563141872L;
    private String name;
    private int age;
    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
