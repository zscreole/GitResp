package com.msb.test01;

import java.util.Date;

/**
 * @Auther: Adam
 * @Date: 2023/7/1 - 14:51
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d.toGMTString());
        System.out.println(d.toLocaleString());
        System.out.println(d.getYear()+1900);
        System.out.println(d.getMonth()+1);
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
    }




}
