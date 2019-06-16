package com.gwq.cnotf.util.MutliThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 14:16 2019/04/24
 */
public class ThreadPoolTest {

    static AtomicInteger ai = new AtomicInteger();
    volatile static int m = 1;
    public static void main(String[] args) {

        //ThreadFactory threadFactory = new DefaultThreadFactory("cnotf-thread");
        NameThreadFactory nameThreadFactory = new NameThreadFactory();

        //默认的异常处理
        //RejectedExecutionHandler abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        MyIgnorePolicy myIgnorePolicy = new MyIgnorePolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,15,5, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<Runnable>(5), nameThreadFactory, myIgnorePolicy);
        for (int i=1;i<=25;i++){
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(m++ +"=="+Thread.currentThread().getName()+"---"+getDate());*/
                }
            });
        }
    }

    public static class NameThreadFactory implements ThreadFactory {
        private final ThreadGroup group;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        NameThreadFactory () {
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() :
                    Thread.currentThread().getThreadGroup();
        }
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(group,r,"cnotf-thread-" + threadNumber.getAndIncrement(),0);
//            System.out.println(thread.getName() + " has been created");
//            System.out.println(m++ +"=="+thread.getName()+"---"+getDate());
            if (t.isDaemon()) {
                t.setDaemon(false);
            }
            if (t.getPriority() != Thread.NORM_PRIORITY){
                t.setPriority(Thread.NORM_PRIORITY);
            }
            return t;
        }
    }

    public static class MyIgnorePolicy implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            doLog(r, executor);
        }

        public void doLog (Runnable r, ThreadPoolExecutor executor) {
            //可以做日志记录
            System.err.println(r.toString() + " rejected");
        }

    }

    synchronized public static String getDate(){
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sd.format(new Date())+ ai.incrementAndGet();
    }
}
