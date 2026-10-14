package com.msb.test14;

import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 12:17
 * @Description: com.msb.test14
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //选择购买匹萨
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择想要制作的匹萨：1.培根匹萨 2.水果匹萨：");
        int choice = sc.nextInt();//选择
        //通过工厂获取匹萨
        Pizza p = PizzaStore.getPizza(choice);
        System.out.println(p.showPizza());

    }
}
