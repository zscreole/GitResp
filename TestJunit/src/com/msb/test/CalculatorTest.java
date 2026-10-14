package com.msb.test;

import com.msb.calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: Adam
 * @Date: 2023/7/4 - 17:08
 * @Description: com.msb.test
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("方法执行开始了。。。");
    }

    @After
    public void close(){
        System.out.println("方法执行结束了。。。");
    }
    //测试add方法
    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(10,30);
        System.out.println(result);
        //加入断言
        Assert.assertEquals(40,result);
    }
    //测试sub方法
    @Test
    public void testSub(){
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        int result = cal.sub(10,30);
        //System.out.println(result);

    }
}
