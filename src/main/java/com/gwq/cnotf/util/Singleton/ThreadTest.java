package com.gwq.cnotf.util.Singleton;

import java.util.concurrent.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:26 2019/06/05
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 0, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i=0,j=10; i < j; i++) {
            threadPoolExecutor.execute(new ThreadSingleton());
        }

    }
}
