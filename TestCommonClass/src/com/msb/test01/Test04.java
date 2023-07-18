package com.msb.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Adam
 * @Date: 2023/7/3 - 9:35
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        //String --> UtilDate
        //1.String -- sqlDate
        java.sql.Date date = java.sql.Date.valueOf("2023-07-03");
        java.util.Date date1 = date;
        System.out.println(date1);
        //2.sqlDate - utilDate

        //定义格式
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = df.parse("2023-07-03 09:41:10");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String d1 = df.format(new Date());
        System.out.println(d1);
    }
}
