package com.msb.test10;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 11:47
 * @Description: com.msb.test10
 * @version: 1.0
 */
public class PetStore {
    public static Animal getAnimal(String petName){
        Animal an = null;

        if("猫".equals(petName)){
            an = new Cat();
        }

        if("狗".equals(petName)){
            an = new Cat();
        }

        return an;
    }
}
