package com.pxj.polymorphic_test;

public class Test {
    public static void main(String[] args) {
        // 创建电脑
        Computer c = new Computer("外星人");
        c.start();

        USB u = new KeyBoard("达尔优");
        c.installUSB(u);

        USB k = new Mouse("罗技");
        c.installUSB(k);
    }
}
