package com.gwq.cnotf.util.Decorator;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 16:57 2019/04/22
 */
public class Test {
    public static void main(String[] args) {
        DisplayLogInterface di = new Decorator2(new Decorator1(new DisplayLog()));
        di.display();
        System.out.println("======================");
        DisplayLogInterface dii = new Decorator3(new Decorator1(new DisplayLog()));
        dii.display();
       /* String[] az = new String[]{"a","c","b","d"};
        List<?> list = new ArrayList<String>(Arrays.asList(az));
        list.forEach(a-> System.out.println(a));*/
    }

}
