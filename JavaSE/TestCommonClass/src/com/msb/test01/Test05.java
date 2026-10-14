package com.msb.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: Adam
 * @Date: 2023/7/3 - 10:15
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal);
        //System.out.println(cal2);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.getActualMinimum(Calendar.DATE));

        cal.set(Calendar.YEAR,2000);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DATE,12);
        System.out.println(cal);

        //string - date
        java.sql.Date date = java.sql.Date.valueOf("2020-4-5");
        cal.setTime(date);
        System.out.println(cal);
    }
}
