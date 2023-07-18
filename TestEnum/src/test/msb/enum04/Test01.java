package test.msb.enum04;

/**
 * @author: Adam
 * @date: 2023/7/7 - 16:02
 * @description: test.msb.enum04
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Gender sex = Gender.男;

        switch (sex){
            case 女:
                System.out.println("是个女孩");
                break;
            case 男:
                System.out.println("是个男孩");
                break;
        }
    }
}
