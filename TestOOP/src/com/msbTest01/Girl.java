package com.msbTest01;

/**
 * @Auther: Adam
 * @Date: 2023/6/27 - 16:53
 * @Description: com.msbTest01
 * @version: 1.0
 */
public class Girl {
   private int age;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
       if(age>=31){
           this.age = 18;
       }else{
           this.age = age;
       }
   }

   public int getAge(){
       return age;
   }
}
