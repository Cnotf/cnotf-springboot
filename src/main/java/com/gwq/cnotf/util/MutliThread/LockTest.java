package com.gwq.cnotf.util.MutliThread;

import java.util.concurrent.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 10:51 2019/06/04
 */
public class LockTest {

    public static void main(String[] args) {
        /**
         * 线程池实现创建多个线程 减少创建线程 销毁线程的开销
         */
        ThreadPoolTest.NameThreadFactory nameThreadFactory = new ThreadPoolTest.NameThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(3), nameThreadFactory
                , new ThreadPoolExecutor.AbortPolicy());
        LockThread lockThread = new LockThread();
        for (int i=0,j=3; i < j; i++) {
            threadPoolExecutor.execute(new LockThreadA(lockThread));
            threadPoolExecutor.execute(new LockThreadB(lockThread));
        }
    }
}
