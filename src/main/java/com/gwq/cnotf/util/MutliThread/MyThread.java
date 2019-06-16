package com.gwq.cnotf.util.MutliThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 22:03 2019/04/26
 */
public class MyThread extends Thread {

    AtomicInteger atomicInteger = new AtomicInteger(5);

    public MyThread () {
//        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        long startMills = System.currentTimeMillis();
        int count = 1;
        for (int i=0; i<5000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endMills = System.currentTimeMillis();
        System.out.println(count);
        System.out.println("多线程用时："+ (endMills - startMills) + "毫秒");

//        System.out.println(Thread.currentThread().getId() + "==" +Thread.currentThread().getName()+"== count: " + atomicInteger.decrementAndGet());
    }
}
