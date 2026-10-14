package com.msb.test01;

/**
 * @Auther: Adam
 * @Date: 2023/7/1 - 14:26
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //CompareTo
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1.compareTo(i2));

        //equals
        Integer i3 = new Integer(12);
        Integer i4 = new Integer(12);
        System.out.println(i3.equals(i2));

        //intValue
        Integer i5 = 130;
        int i = i5.intValue();
        System.out.println(i);

        //parseInt
        int i6 = Integer.parseInt("12");
        System.out.println(i6);

        //toString
        Integer i7 = 130;
        System.out.println(i7.toString());
    }
}
