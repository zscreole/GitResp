package com.msb.test05;

/**
 * @Auther: Adam
 * @Date: 2023/6/28 - 13:25
 * @Description: com.msb.test05
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    public Student(){
        /*super();*/
    }

    public Student(double score){
        this.score = score;
    }

    public Student(int age,String name,double score){
        super(age,name);
        this.score = score;
    }
}
