package com.arithmetic;

/*
 * 演示算术运算符的使用
 * */
public class Arithmetic01 {
    public static void main(String[] args) {
        // / 除法使用
        System.out.println(10 / 4);  // 2
        System.out.println(10.0 / 4); // 2.5 计算以高精度的为准
        double d = 10 / 4;
        System.out.println(d); // 2.0

        // % 取余，取模 使用
        // 取模的本质 a % b = a-a/b*b  被除数的符号即取模的符号
        System.out.println(10 % 3);   // 1
        System.out.println(-10 % 3);  // -1 (-10)-(-10)/3*3 = -1
        System.out.println(10 % -3);  // 1  10-10/(-3)*(-3) = 1
        System.out.println(-10 % -3); // -1 (-10)-(-10)/(-3)*(-3) = -1

        // ++ 使用
        int i = 10;
        i++; // 自增 等价于 i = i + 1; => i = 11
        ++i; // 自增 等价于 i = i + 1; => i = 12
        System.out.println("i=" + i); // 12

        /*
         * 作为表达式使用
         * 前++：++i先自增后赋值
         * 后++：i++先赋值后自增
         * */
        int j = 8;
        int k = ++j; // 等价 j = j + 1; k = j;
        int m = j++; // 等价于 m = j; j = j+ 1
        System.out.println("k=" + k + "j=" + j); // k=9 j=10
        System.out.println("m=" + m + "j=" + j); // m=9 j=10
    }
}
