package test.msb.enum02;

/**
 * @author: Adam
 * @date: 2023/7/7 - 13:41
 * @description: test.msb.enum02
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter);
        System.out.println(Season.class.getSuperclass().getName());

        Season autumn = Season.AUTUMN;
        System.out.println(autumn.toString());

        Season [] values = Season.values();
        for(Season s: values){
            System.out.println(s);
        }
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);
    }
}
