package com.pxj.thisDemo;

public class Car {
    public Car() {
        System.out.println("无参构造中的this:" + this);
    }

    public void run() {
        System.out.println("这是方法中的this:" + this);
    }
}
