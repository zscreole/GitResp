package test.msb.enum03;

/**
 * @author: Adam
 * @date: 2023/7/7 - 15:21
 * @description: test.msb.enum03
 * @version: 1.0
 */
public enum Season implements TestInterface{
    SPRING{
        @Override
        public void show(){
            System.out.println("这是春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show(){
            System.out.println("这是秋天");
        }
    },
    WINTER{
        @Override
        public void show(){
            System.out.println("这是秋天");
        }
    };
}
