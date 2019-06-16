package com.gwq.cnotf.util.MutliThread;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 15:00 2019/05/30
 */
public class Thread1 implements Runnable{

    private Object lock;

    private static final int INT_VALUE = 5;

    public Thread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                if (MyList.getSize() != INT_VALUE) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("wait start :" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("wait end :" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
