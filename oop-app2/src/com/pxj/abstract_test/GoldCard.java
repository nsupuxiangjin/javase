package com.pxj.abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("当前消费："+ money);
        System.out.println("卡片余额："+ getMoney());
        // 优惠计算
        double str = money*0.8;
        System.out.println("实际支付：" + str);
        // 更新余额
        setMoney(getMoney()-str);
        System.out.println("账户余额：" + getMoney());
    }
}
