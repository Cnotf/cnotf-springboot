package com.gwq.cnotf.util.inner;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 20:53 2019/05/21
 */
public class Fruit {

    private String color;

    public Fruit (String color) {
        this.color = color;
    }

    public class Apple {
        private String kg;
        public Apple (String kg) {
            this.kg = kg;
        }
        public void getKg() {
            System.out.println(kg+color);
        }
    }

    public void getKg() {
        Apple apple = new Apple("123");
        apple.getKg();
    }

    public Fruit getddd () {
        return new Fruit("55"){
            private String a = "11";

            @Override
            public void getKg () {
                System.out.println(super.color + a);
            }

        };
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit("567");
        Fruit.Apple apple = fruit.new Apple("15.3");
        System.out.println(apple.kg);
        apple.getKg();
        fruit.getKg();
        Fruit getddd = fruit.getddd();
        getddd.getddd();
    }
}
