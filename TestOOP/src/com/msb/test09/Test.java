package com.msb.test09;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 17:20
 * @Description: com.msb.test09
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(30,"鹿晗");
        Girl girl = new Girl("关晓彤",100.0);

        girl.love(boy);
        girl.m = new Mom();
        girl.chat();
    }

}
