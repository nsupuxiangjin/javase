package com.pxj.thisDemo;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.run(); // 无参构造中的this:com.pxj.thisDemo.Car@1b6d3586
        System.out.println(c); // com.pxj.thisDemo.Car@1b6d3586
    }
}
