package com.msb.test14;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 12:15
 * @Description: com.msb.test14
 * @version: 1.0
 */
public class FruitPizza extends Pizza {
    //属性
    private String burdening;//配料

    //方法

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //重写父类的showPizza方法
    public String showPizza(){
        return super.showPizza()+"\n配料水果："+burdening;
    }

    //构造器
    public FruitPizza() {
    }

    public FruitPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }
}
