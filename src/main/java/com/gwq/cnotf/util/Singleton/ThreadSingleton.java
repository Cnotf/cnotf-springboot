package com.gwq.cnotf.util.Singleton;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:26 2019/06/05
 */
public class ThreadSingleton extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(EagerSingleton.getInstance());
    }
}
