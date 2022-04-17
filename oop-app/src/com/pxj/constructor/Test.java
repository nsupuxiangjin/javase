package com.pxj.constructor;

// 目标：认识构造器，明白两种类型构造器作用
public class Test {
    public static void main(String[] args) {
        // 通过构造器得到对象
        Car c1 = new Car();
        c1.name  = "宝马";
        c1.price = 45.1;
        System.out.println(c1.name); // 宝马
        System.out.println(c1.price); // 45.1


        Car c2 = new Car("奔驰", 50.1);
        System.out.println(c2.name); // 奔驰
        System.out.println(c2.price); // 50.1

    }
}
