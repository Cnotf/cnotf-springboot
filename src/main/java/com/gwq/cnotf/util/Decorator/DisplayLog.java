package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description: 日志打印类
 * @Date: Create in 10:37 2019/04/23
 */
public class DisplayLog implements DisplayLogInterface{

    @Override
    public void display() {
        System.out.println("打印日志到控制台");
    }
}
