package com.gwq.cnotf.util.MutliThread;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 10:49 2019/06/04
 */
public class LockThreadB extends Thread {

    private LockThread lockThread;

    public LockThreadB(LockThread lockThread) {
        this.lockThread = lockThread;
    }
    @Override
    public void run() {
        super.run();
        lockThread.write();
    }
}
