package com.gwq.cnotf.util.MutliThread;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 15:00 2019/05/30
 */
public class Thread2 implements Runnable{

    private Object lock;

    private static final int INT_5_VALUE = 5;
    private static final int INT_10_VALUE = 10;

    public Thread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i=0; i < INT_10_VALUE; i++) {
                MyList.add();
                if (MyList.getSize() == INT_5_VALUE) {
                    System.out.println("start notify:" + System.currentTimeMillis());
                    lock.notify();
                    System.out.println("end notify:" + System.currentTimeMillis());
                }
                System.out.println("list's size is :" + MyList.getSize());
            }
        }
    }
}
