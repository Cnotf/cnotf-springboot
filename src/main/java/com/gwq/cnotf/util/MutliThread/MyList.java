package com.gwq.cnotf.util.MutliThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 15:18 2019/05/30
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add () {
        list.add("anyString");
    }

    public static int getSize () {
        return list.size();
    }
}
