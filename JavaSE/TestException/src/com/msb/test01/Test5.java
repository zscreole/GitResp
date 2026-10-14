package com.msb.test01;

import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 17:04
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        //实现一个功能：两个数相除，当除数为0的时候，程序抛出异常
        /*try {
            divide();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        divide();
    }
    public static void divide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        if(num2 == 0){//除数为0，制造异常
            /*throw new RuntimeException();*/
            /*try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            throw new Exception();
        }else {
            System.out.println("商：" + num1 / num2);
        }
    }
}
