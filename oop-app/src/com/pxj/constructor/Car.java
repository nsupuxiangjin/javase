package com.pxj.constructor;

public class Car {
    String name;
    double price;

    // 无参构造器
    public Car() {
    }

    // 有参构造器
    public Car(String n, double p) {
        name = n;
        price = p;
    }
}
