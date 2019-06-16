package com.gwq.cnotf.util.Singleton;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 09:36 2019/05/20
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance () {
        return eagerSingleton;
    }
}
