package com.msb.test14;

import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 12:40
 * @Description: com.msb.test14
 * @version: 1.0
 */
public class PizzaStore {
    public static Pizza getPizza(int choice){
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        switch(choice){
            case 1:
            {
                System.out.print("请输入培根的克数：");
                int weight = sc.nextInt();
                System.out.print("请输入匹萨的大小：");
                int size = sc.nextInt();
                System.out.print("请输入匹萨的价格：");
                int price = sc.nextInt();
                //将录入的信息封装成培根匹萨的对象
                BaconPizza bp = new BaconPizza("培根匹萨", size, price, weight);
                p = bp;
                //System.out.println(bp.showPizza());
            }
            break;
            case 2:
            {
                System.out.print("请输入你想要加入的水果：");
                String burdening = sc.next();
                System.out.print("请输入匹萨的大小：");
                int size = sc.nextInt();
                System.out.print("请输入匹萨的价格：");
                int price = sc.nextInt();
                //将录入的信息封装成水果匹萨的对象
                FruitPizza fp = new FruitPizza("水果匹萨",size,price,burdening);
                p = fp;
                //System.out.println(fp.showPizza());
            }
            break;
        }
        return p;
    }
}
