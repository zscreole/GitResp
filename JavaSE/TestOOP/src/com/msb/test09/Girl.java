package com.msb.test09;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 17:17
 * @Description: com.msb.test09
 * @version: 1.0
 */
public class Girl {
    //属性
    String name;
    double weight;
    Mom m ;
    //方法
    public void love(Boy b){
        System.out.println("我的男朋友名字是："+b.name+",年龄是："+b.age);
        b.buy();
    }
    public void chat(){
        m.say();
    }
    //构造器

    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
