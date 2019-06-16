package com.gwq.cnotf.util.Singleton;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 11:22 2019/05/20
 */
public class EagerStaticSingleton {

    private EagerStaticSingleton(){

    }


    private static class EagerStatic {
        private static EagerStaticSingleton eagerStaticSingleton= new EagerStaticSingleton();
    }

    public static EagerStaticSingleton getInstance () {
        return EagerStatic.eagerStaticSingleton;
    }
}
