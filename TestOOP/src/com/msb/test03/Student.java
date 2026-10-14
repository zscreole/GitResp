package com.msb.test03;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 10:14
 * @Description: com.msb.test03
 * @version: 1.0
 */
public class Student extends Person {
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study(){
        System.out.println("学习。。。");
    }
}
