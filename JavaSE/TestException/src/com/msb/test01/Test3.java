package com.msb.test01;

import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 16:05
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商：" + num1 / num2);
        }catch(Exception e){
            //System.out.println(e.toString());
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            throw e;
        }finally{
            System.out.println("谢谢你使用计算器");
        }
    }
}
