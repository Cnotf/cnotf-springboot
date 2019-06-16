package com.gwq.cnotf.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 11:00 2019/03/04
 */
public class Regex {

    public static void main(String[] args){
        int ccc = 1_000_00_0;
        double ddd  = 0x1.0p-3;
        System.out.println(ddd);
        System.out.println(ccc);
        List<String> lists = new ArrayList<String>();
        lists.add("c");
        lists.add("E");
        lists.add("d");
        System.out.println(lists.get(0)+"--"+lists.get(1)+"--"+lists.get(2));
        Collections.swap(lists,1,2);
        System.out.println(lists.get(0)+"--"+lists.get(1)+"--"+lists.get(2));

        Collections.reverse(lists);
        System.out.println(lists.get(0)+"--"+lists.get(1)+"--"+lists.get(2));
        Collections.reverseOrder();
        System.out.println(lists.get(0)+"--"+lists.get(1)+"--"+lists.get(2));
        System.out.println(Collections.max(lists));
        System.out.println(Collections.min(lists));
        Integer a = Integer.valueOf("100",8);
        System.out.println(a);
        /*System.out.println(Integer.valueOf(0x7fffffff));
        System.out.println(Integer.valueOf(0x80000000));
        System.out.println(Collections.max(lists,
                String.CASE_INSENSITIVE_ORDER));*/
    }
}

