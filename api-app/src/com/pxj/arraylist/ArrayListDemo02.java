package com.pxj.arraylist;

import java.util.ArrayList;

// 目标：能够使用泛型约束ArrayList集合操作的数据类型。
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(); // 从JDK1.7开始：泛型后面的类型声明可以不写
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
    }
}
