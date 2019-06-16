package com.gwq.cnotf.util.Adapter;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:10 2019/05/17
 */
public class GreenDuck implements Duck{

    @Override
    public void getColor () {
        System.out.println("green");
    }

    @Override
    public void swim (){
        System.out.println("i am swimming");
    }
}
