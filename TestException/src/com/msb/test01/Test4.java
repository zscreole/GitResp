package com.msb.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 16:28
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商：" + num1 / num2);
        }catch(ArithmeticException ae) {
            System.out.println("对不起，除数不能为零");
        }catch(InputMismatchException ie) {
            System.out.println("对不起，你录入的不是int类型的数据");
        }catch(Exception a){
                System.out.println("对不起，你录入的不是int类型的数据");

        }finally {
            System.out.println("谢谢你使用计算器");
        }
    }
}
