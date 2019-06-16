package com.gwq.cnotf.util.Adapter;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:14 2019/05/17
 */
public class TurkeyToDuckAdapter implements Duck{


    private Turkey turkey;

    public TurkeyToDuckAdapter (Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void getColor() {
        turkey.bloob();
    }

    @Override
    public void swim() {
        turkey.fly();
    }
}
