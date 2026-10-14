package com.msb.test11;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 13:54
 * @Description: com.msb.test11
 * @version: 1.0
 */
public abstract class Person {
    public void eat(){
        System.out.println("一顿不吃饿得慌");
    }

    public abstract void say();
    public abstract void sleep();
}

class Student extends Person{
    @Override
    public void say() {
        System.out.println("我是东北人，喜欢唠嗑");
    }

    @Override
    public void sleep() {
        System.out.println("东北人喜欢睡觉");
    }
}

class Demo{
    public static void main(String[] args) {
        Student s = new Student();
        s.say();
        s.sleep();
    }

}


