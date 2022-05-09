package com.pxj.d3_static_SingleInstance;

// 懒汉单例
public class SingleInstance2 {
    // 2、定义一个静态成员变量存储一个对象。
    // 只加载一次，只有一份,最好私有化，避免外面调用为空
    private static SingleInstance2 instance = null;

    // 2、提供方法，对外访问单例对象!
    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }

    // 1、私有化构造器
    private SingleInstance2() {
    }
}
