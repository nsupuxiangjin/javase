package com.pxj.thisDemo;

public class Car {
    String name;
    double price;

    // 有参构造
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
        System.out.println("无参构造中的this:" + this);
    }

    public void goWith(String name) {
        System.out.println(this.name + "和正在和" + name + "比赛");
    }

    public void run() {
        System.out.println("这是方法中的this:" + this);
    }
}
