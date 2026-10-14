package com.msb.test01;

import java.util.Arrays;

/**
 * @Auther: Adam
 * @Date: 2023/7/4 - 10:34
 * @Description: com.msb.test01
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        String str2 ="";

        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[] {'a','b'});

        String s4 = "abc";
        System.out.println(s4.length());
        System.out.println(s4.charAt(1));
        System.out.println(s4.isEmpty());

        String s5 = "abcdefhijk";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(3,6));

        String s6 = "abcdeahija";
        System.out.println(s6.replace('a','u'));

        String s7 = "a-b-c-d-e";
        String[] strs = s7.split("-");
        System.out.println(Arrays.toString(strs));

        String s8 = "abc";
        System.out.println(s8.toUpperCase());

        String s9 = "  aa bb cc   ";
        System.out.println(s9.trim());

        String s10 = "abc";
        System.out.println(s10.toString());

        System.out.println(String.valueOf(false));
        System.out.println(s9.concat(s10));

    }
}
