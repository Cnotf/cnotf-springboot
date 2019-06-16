package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 21:04 2019/05/16
 */
public class Decorator3 extends DecoratorAbs {



    public Decorator3(DisplayLogInterface di) {
        super(di);
    }

    @Override
    public void display() {
        super.display();
        publish();
    }

    public void publish () {
        System.out.println("Decorator3:打印日志到数据库中");
    }
}
