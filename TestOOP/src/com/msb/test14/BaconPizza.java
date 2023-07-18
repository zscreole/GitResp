package com.msb.test14;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 12:12
 * @Description: com.msb.test14
 * @version: 1.0
 */
public class BaconPizza extends Pizza {
    //属性
    private int weight;//重量
    //方法
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //重写父类的showPizza方法
    public String showPizza(){
        return super.showPizza()+"\n培根克数："+ weight+"克";
    }

    //构造器
    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }
}
