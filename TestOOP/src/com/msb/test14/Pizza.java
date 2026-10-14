package com.msb.test14;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 11:23
 * @Description: com.msb.test14
 * @version: 1.0
 * 父类：pizza类
 */
public class Pizza {
    //属性
    private String name;//名称
    private int size;//大小
    private int price;//价格
    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //展示匹萨信息
    public String showPizza(){
        return "名称："+name+"\n价格："+price+"元\n大小："+size+"寸";
    }

    //构造器
    public Pizza() {
    }

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
