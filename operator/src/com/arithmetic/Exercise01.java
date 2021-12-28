package com.arithmetic;

public class Exercise01 {
    public static void main(String[] args) {
        // 1
        int i = 1;
        i = i +1;
        System.out.println(i); // 2

        // 2
        int b = 1;
        b = ++b;
        System.out.println(b); // 2

        // 3
        int i1= 10;
        int i2 = 20;
        int c = i1++;
        System.out.println("c=" + c); // 10
        System.out.println("i2=" + i2); // 20
        c = --i2;
        System.out.println("c=" + c); // 19
        System.out.println("i2=" + i2); // 19

    }
}
