package com.msb.test01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: Adam
 * @Date: 2023/7/3 - 16:33
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        //格式化类：DateTimeFormatter
        //方式一:预定义的标准格式。如: ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;IS0_LOCAL_TIME
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String str = df1.format(now);
        System.out.println(str);//2023-07-03T16:42:55.672

        //str---> LocalDateTime
        TemporalAccessor parse = df1.parse("2023-07-03T16:42:55.672");
        System.out.println(parse);

        //方式二:本地化相关的格式。如: oflocalizedDateTime()
        //参数：FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //LocalDateTime -- str
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);

        //str---> LocalDateTime
        TemporalAccessor parse1 = df2.parse("2023年7月3日 下午04时48分59秒");
        System.out.println(parse1);

        //方式三: 自定义的格式。如: ofPattern( "yyyy-MM-dd hh:mm:ss") ---》重点，以后常用
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //LocalDateTime -- str
        LocalDateTime now2 = LocalDateTime.now();
        String format = df3.format(now2 );
        System.out.println(format);//2023-07-03 04:54:57

        //str---> LocalDateTime
        TemporalAccessor parse2 = df3.parse("2023-07-03 04:54:57");
        System.out.println(parse2);
    }

}
