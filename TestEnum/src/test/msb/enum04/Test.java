package test.msb.enum04;

/**
 * @author: Adam
 * @date: 2023/7/7 - 15:55
 * @description: test.msb.enum04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
        p.setSex(Gender.女);
        System.out.println(p);
    }
}
