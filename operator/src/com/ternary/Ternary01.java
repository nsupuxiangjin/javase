package com.ternary;

public class Ternary01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result + "a" + a + "b=" + b); // result = 20, a= 10, b=19
    }
}
