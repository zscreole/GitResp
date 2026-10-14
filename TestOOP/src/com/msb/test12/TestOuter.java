package com.msb.test12;

import java.sql.SQLOutput;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 15:24
 * @Description: com.msb.test12
 * @version: 1.0
 */
public class TestOuter {
    //成员内部类
    class D{
        int age = 20;
        String name;
        public void method(){
            //内部类可以访问外部类的内容
            /*System.out.println(age);
            a();*/
            int age = 30;
            //内部类和外部类属性重名时如何进行调用
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
        }
    }
    //静态成员内部类
    static class E{
        public void method(){
            //静态内部类中只能访问外部类中被static修饰的内容
            /*System.out.println(age);
            a();*/
        }
    }
    //属性
     int  age = 10;
    //方法
    public  void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
            class B{

            }
        }
        class A{

        }
        //外部类想要访问内部类的东西，需要创建内部类的对象然后进行调用
        D d = new D();
        System.out.println(d.name);
        d.method();
    }

    //构造器
    public TestOuter(){
        class C{

        }
    }

    public TestOuter(int age) {
        this.age = age;
    }
}

class Demo{
    public static void main(String[] args) {
        //创建外部类的对象
        TestOuter t = new TestOuter();
        t.a();

        //创建内部类的对象
        //静态内部类创建对象
        TestOuter.E e = new TestOuter.E();
        //非静态内部类
        //TestOuter.D d = new TestOuter.D();
        TestOuter.D d = t.new D();
    }
}


