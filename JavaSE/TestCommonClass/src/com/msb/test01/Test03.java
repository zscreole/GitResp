package com.msb.test01;

import java.sql.Date;

/**
 * @Auther: Adam
 * @Date: 2023/7/1 - 15:09
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Date d = new Date(1688195417603L);
        System.out.println(d.toString());

        java.util.Date date = new java.util.Date();
      //  Date date1 = (Date) date;

        Date date2 = new Date(date.getTime());

        java.util.Date date3 = d;

        Date date4 = Date.valueOf("2019-3-8");
        System.out.println(date4);
    }
}
