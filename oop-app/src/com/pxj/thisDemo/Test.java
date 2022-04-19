package com.pxj.thisDemo;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // 无参构造中的this:com.pxj.thisDemo.Car@1b6d3586
        System.out.println(c); // com.pxj.thisDemo.Car@1b6d3586

        System.out.println("-------------");
        Car c2 = new Car("奔驰", 45.6);
        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.goWith("宝马");
    }
}
