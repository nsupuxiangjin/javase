package com.pxj.api_stringbuilder;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("c");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        sb.append("abc");

        System.out.println(sb);
    }
}
