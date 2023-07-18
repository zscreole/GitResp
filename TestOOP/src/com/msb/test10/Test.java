package com.msb.test10;

/**
 * @Auther: Adam
 * @Date: 2023/6/29 - 10:53
 * @Description: com.msb.test10
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
        /*Cat c = new Cat();
        g.play(c);*/

        /*Dog d = new Dog();
        //g.play(d);
        Animal a = d;
        g.play(a);

        Dog d1 = (Dog) a;
        d1.guard();*/
        Animal a = PetStore.getAnimal("猫");
        g.play(a);

    }


}
