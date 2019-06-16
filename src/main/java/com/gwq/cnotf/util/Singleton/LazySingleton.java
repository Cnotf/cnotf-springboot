package com.gwq.cnotf.util.Singleton;

import java.io.Serializable;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 09:39 2019/05/20
 */
public class LazySingleton implements Serializable {

    private volatile static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance () {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public Object readResolve() {
        return lazySingleton;
    }
}
