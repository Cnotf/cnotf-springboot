package com.gwq.cnotf.util.Singleton;

import java.util.concurrent.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 09:38 2019/05/20
 */
public class Test {

    public static void main(String[] args) throws Exception{
        //懒汉式单例
        /*System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());*/
        //饿汉式单例
        //单线程下测试
        /*System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());*/
        //多线程下测试
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        for (int i = 1; i <= 10; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"==="+EagerStaticSingleton.getInstance());
                }
            });
        }
        //枚举实现单例模式测试
        //EnumSingleton.uniquesingleton.getOrder();
        //序列化测试
        //序列化
       /* ObjectOutputStream test = new ObjectOutputStream(new FileOutputStream("test"));
        test.writeObject(LazySingleton.getInstance());
        test.close();
        //反序列化
        File test1 = new File("test");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(test1));
        LazySingleton lazySingleton = (LazySingleton) objectInputStream.readObject();
        System.out.println(lazySingleton);
        System.out.println(LazySingleton.getInstance());
        System.out.println(lazySingleton == LazySingleton.getInstance());
        test1.delete();*/
    }
}
