package com.msb.test13;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 16:48
 * @Description: com.msb.test13
 * @version: 1.0
 */
public class TestOuter {
    //1在局部内部类中访问到的变量必须是被final修饰的
    public void method(){
        int num = 10;
        class A{
            public void a(){
                //num = 20;
                System.out.println(num);
            }
        }
    }
    //2.如果类B在整个项目中只使用一次，那么就没必要单独创建一个B类，使用内部类就可以了
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }

    public Comparable method3(){
        //3.匿名内部类
        return new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public void test(){
        Comparable com =  new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abc"));
    }

    public static void main(String[] args) {
        TestOuter t = new TestOuter();
        t.test();



    }
}
