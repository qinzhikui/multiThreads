package com.ximalaya.search;

import org.junit.Test;

public class MyRunnableTest {

    @Test
    public void myRunnableTest() {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }

}
