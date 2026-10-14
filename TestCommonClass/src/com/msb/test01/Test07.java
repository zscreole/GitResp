package com.msb.test01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: Adam
 * @Date: 2023/7/3 - 15:57
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {

        //完成实例化
        //方法1：now
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //方法2:of
        LocalDate of = LocalDate.of(2010,5,6);
        System.out.println(of);
        LocalTime of1 = LocalTime.of(16,4,23);
        System.out.println(of1);
        LocalDateTime of2 = LocalDateTime.of(1985,3,5,13,14,23);
        System.out.println(of2);

        //get
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //with
        LocalDateTime localDateTime2 = localDateTime.withMonth(2);
        System.out.println(localDateTime2);
        System.out.println(localDateTime);

        //加
        LocalDateTime localDateTime3 = localDateTime.plusMonths(2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime);

        //减
        LocalDateTime localDateTime4 = localDateTime.minusMonths(1);
        System.out.println(localDateTime4);
        System.out.println(localDateTime);

    }

}
