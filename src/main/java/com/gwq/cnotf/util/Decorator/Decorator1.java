package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description: 具体装饰类1
 * @Date: Create in 10:44 2019/04/23
 */
public class Decorator1 extends DecoratorAbs {

    Decorator1(DisplayLogInterface di){
        super(di);
    }

    @Override
    public void display() {
        //调用被装饰类的方法
        super.display();
        getdate();
    }

    private void getdate(){
        System.out.println("decorator1:打印日志到redis");
    }
}
