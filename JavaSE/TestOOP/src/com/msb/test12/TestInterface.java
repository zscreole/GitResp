package com.msb.test12;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 14:52
 * @Description: com.msb.test12
 * @version: 1.0
 */
public interface TestInterface {
    public static final int NUM = 10;

    public abstract void a();

    public default void b(){
        System.out.println("----TestInterface----b-----");
    }

    public static void c(){
        System.out.println("Interface中的静态方法 ");
    }
}

class Demo1 implements TestInterface{
    @Override
    public void a() {
        System.out.println("重写了a的抽象方法");
    }

    public static void c(){
        System.out.println("Demo中的静态方法 ");
    }
}

class Test{
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.c();
        Demo1.c();
        TestInterface.c();
    }
}


