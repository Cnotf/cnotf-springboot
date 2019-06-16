package com.gwq.cnotf.util.MutliThread;

import java.util.concurrent.locks.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 10:44 2019/06/04
 */
public class LockThread {

    //默认是采用非公平锁
    private  Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    //采用公平锁
//    private  Lock lock = new ReentrantLock(true);
    //采用非公平读写锁
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //采用公平读写锁
//    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
    Lock lock1  = readWriteLock.writeLock();
    Condition condition1 =  lock1.newCondition();
    Condition condition2 =  lock1.newCondition();

    private Boolean isValue = false;

    public  void testMethod () {
        //测试lock  读锁 写锁
        //lock 和 写锁 （排他锁）同一时刻只有一个线程能执行该代码段 测试每个线程等待1秒 其他线程才能执行该代码段
        //读锁 是共享锁 多个线程可以同时访问代码段 测试结果显示 线程几乎同一时刻访问的
//        lock.lock();
//        readWriteLock.readLock().lock();

//        readWriteLock.writeLock().lock();
        lock1.lock();
        for (int i=0,j=2; i < j; i++ ) {
            System.out.println("写"+i + "-" + System.currentTimeMillis() + "-ThreadName:" + Thread.currentThread().getName());
        }
        System.out.println("testMethod 方法 等待");
        try {
            if (isValue == false) {
                condition1.await();
            }
//            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testMethod 方法 继续执行");
        isValue = true;
        condition2.signal();
//        lock.unlock();
//        readWriteLock.readLock().unlock();
//        readWriteLock.writeLock().unlock();
        lock1.unlock();
    }


    public void write () {
//        readWriteLock.readLock().lock();
        lock1.lock();
        for (int i=3,j=5; i < j; i++ ) {
            System.out.println("读" +i + "-" + System.currentTimeMillis() + "-ThreadName:" + Thread.currentThread().getName());
        }
        System.out.println("write 方法 等待");
        try {
            if (isValue == true) {
                condition2.await();
            }
//            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("write 方法 继续执行");
        isValue = false;
        condition1.signal();
//        readWriteLock.readLock().unlock();
        lock1.unlock();
    }

}
