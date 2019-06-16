package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description: 具体装饰类2
 * @Date: Create in 11:03 2019/04/23
 */
public class Decorator2 extends DecoratorAbs{

    public Decorator2(DisplayLogInterface di){
        super(di);
    }

    @Override
    public void display() {
        //调用被装饰类的方法
        super.display();
        getmm();
    }

    private void getmm(){
        System.out.println("decorator2:打印到日志文件中");
    }
}
