package com.msb.test09;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 17:14
 * @Description: com.msb.test09
 * @version: 1.0
 */
public class Boy {
    //属性
    int age;
    String name;

    //方法
    public void buy(){
        System.out.println("跟我谈恋爱，我给你买买买。。。");
    }
    //构造器
    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
