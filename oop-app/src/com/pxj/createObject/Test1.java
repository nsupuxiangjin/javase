package com.pxj.createObject;

// 目标： 学会设计对象并使用
public class Test1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "宝马";
        car.price = 45.6;
        car.stat();
        car.run();
    }
}
