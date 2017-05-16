package com.more.lambda;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class LambdaTest {

    private int a;


    @Test
    public void test01() {
        System.out.println("Hello word");
        System.out.println("");

        System.out.println("");

    }

    public static void testLambda1() {
        new  Thread(()->System.out.println("helloLabda")).start();

    }

    public static void testLabda2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("helloLabda2");
            }
        }).start();
    }

    public static  void main(String[] args) {
        LambdaTest.testLabda2();
        LambdaTest.testLambda1();
    }

}
