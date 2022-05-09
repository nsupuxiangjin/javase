package com.pxj.d3_static_SingleInstance;

// 使用饿汉单列实现单列类
public class SingleInstance {
    // 饿汉单列是在获取对象前，对象已经提前准备好了

    public static SingleInstance instance = new SingleInstance();

    // 1、构造器私有化
    private SingleInstance() {}
}
