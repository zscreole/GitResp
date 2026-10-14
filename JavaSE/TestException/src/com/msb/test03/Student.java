package com.msb.test03;

/**
 * @Auther: Adam
 * @Date: 2023/6/30 - 17:24
 * @Description: com.msb.test02
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex)  {
        if("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }else{
            /*throw new RuntimeException();*/
            throw new MyException("对不起，性别不对");
        }

    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        try {
            this.setSex(sex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
