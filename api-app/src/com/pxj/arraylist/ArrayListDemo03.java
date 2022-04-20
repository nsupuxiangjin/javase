package com.pxj.arraylist;

import java.util.ArrayList;

// 目标：掌握ArrayList集合的常用API。
public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("mysql");
        list1.add("小米");
        list1.add("华为");

        // 1、public E get(int index)获取某个索引位置处的元素
        String e = list1.get(2);
        System.out.println(e); // 小米

        // 2、public int size():获取集合的大小（元素个数）
        System.out.println(list1.size()); // 4
        // 3、完成集合的遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
    }
}
