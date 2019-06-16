package com.gwq.cnotf.util.Adapter;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:16 2019/05/17
 */
public class Test {

    public static void main(String[] args) {
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(new SmallTurkey());
//        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(new BigTurkey());
        turkeyToDuckAdapter.getColor();
        turkeyToDuckAdapter.swim();
    }
}
