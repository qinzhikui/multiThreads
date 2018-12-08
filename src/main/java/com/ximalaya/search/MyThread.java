package com.ximalaya.search;

public class MyThread extends Thread {

    private static int a = 5;

    @Override
    public synchronized void run() {
        super.run();
        a--;
        System.out.println(a);

    }

}
