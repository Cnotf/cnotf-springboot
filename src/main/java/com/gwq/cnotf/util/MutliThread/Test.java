package com.gwq.cnotf.util.MutliThread;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 13:34 2019/04/26
 */
public class Test extends Thread{


    public static void main(String[] args) throws Exception{
        Object o = new Object();
        Thread thread1 = new Thread(new Thread1(o));
        thread1.start();
        Thread thread2 = new Thread(new Thread2(o));
        thread2.start();
    }

}