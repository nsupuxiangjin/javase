package com.pxj.abstract_test;

public class Test {
    public static void main(String[] args) {
        // 抽象类基本使用；加油站优惠案例
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("小米");
        c.pay(300);
    }
}
