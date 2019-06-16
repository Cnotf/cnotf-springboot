package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description: 抽象装饰类 (继承接口类是为了能把具体装饰类嵌套 具体参照 Test 类中的逻辑)
 * @Date: Create in 10:41 2019/04/23
 */
public abstract class DecoratorAbs implements DisplayLogInterface{

    /**
     * 声明日志接口类是为了调用
     * 打印日志类中的display()方法
     */
    private DisplayLogInterface di;

    public DecoratorAbs(DisplayLogInterface di) {
        this.di = di;
    }

    @Override
    public void display() {
        di.display();
    }
}
