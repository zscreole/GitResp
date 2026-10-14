package com.msb.test01;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: Adam
 * @Date: 2023/7/3 - 11:34
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        //String --->Calender
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期：（提示：请按照例如2019-3-7的格式）");
        //String ---> SqlDate
        String strDate = sc.next();
        //sqlDate ---> Calendar
        java.sql.Date sqlDate = java.sql.Date.valueOf(strDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(sqlDate);

        //星期提示
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //获取该月最大的日期
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //System.out.println(maxDay);
        //取得当前日期中的日
        int curDate = cal.get(Calendar.DATE);
        //System.out.println(curDate);
        //将日期设为本月1号
        cal.set(Calendar.DATE,1);
        //获取1号是本周的第几天
        int num = cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println(num);
        //前面空出来的天数为
        int day = num -1;
        //引入计数器，每7天要换行
        int count = 0;
        //遍历前需要打印空格
        for(int i=1;i<=day;i++){
            System.out.print("\t");
        }
        //空出来的日子也要放入计数器
        count = count + day;
        //循环遍历从1号到maxDay
        for(int i=1;i<=maxDay;i++){
            if(curDate == i){//如果是当前日期就加星号
                System.out.print(i+"*\t");
            }else{
                System.out.print(i+"\t");
            }
            count ++;
            if(count%7==0){
                System.out.println();
            }
        }

    }
}
