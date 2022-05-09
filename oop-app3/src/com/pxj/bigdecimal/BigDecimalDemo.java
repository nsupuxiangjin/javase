package com.pxj.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点数计算，精度失真
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);
        System.out.println("-----------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);
        System.out.println("-----------------------");
        // 包装浮点型数据成为BigDecimal

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
    }
}
