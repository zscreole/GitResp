package com.msb.test01;

import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 15:15
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //功能：实现两个数相除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        if(sc.hasNextInt()){
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            if(sc.hasNextInt()){
                int num2 = sc.nextInt();
                if(num2 == 0){
                    System.out.println("对不起，除数不能为零");
                }else {
                    System.out.println("商：" + num1 / num2);
                }
            }else{
                System.out.println("对不起，你录入的不是int类型的数据");
            }

        }else{
            System.out.println("对不起，你录入的不是int类型的数据");
        }

    }
}
