package com.msb.test03;

/**
 * @Auther: Adam
 * @Date: 2023/7/1 - 11:33
 * @Description: com.msb.test03
 * @version: 1.0
 */
public class MyException extends RuntimeException {
    static final long serialVersionUID = -7034897190L;

    public MyException() {
    }

    public MyException(String msg){
        super(msg);
    }
}
