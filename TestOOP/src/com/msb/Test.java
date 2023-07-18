package com.msb;

/**
 * @Auther: Adam
 * @Date: 2023/6/27 - 9:15
 * @Description: com.msb
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person zs = new Person();
        zs.name = "张三";
        zs.age = 19;
        zs.height = 180.4;
        zs.weight = 170.4;

        Person ls = new Person();
        ls.name = "李四";
        ls.age = 18;
        ls.height = 170.6;
        ls.weight = 160.6;

        System.out.println(zs.name);
        System.out.println(ls.age);

        zs.eat();
        ls.eat();

        zs.sleep("教室");
        String s = zs.introduce();
        System.out.println(s);
        System.out.println(zs.introduce());
    }
}
