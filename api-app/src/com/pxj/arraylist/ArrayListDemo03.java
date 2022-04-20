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
        list1.add("java");

        // 1、public E get(int index):获取某个索引位置处的元素
        String e = list1.get(2);
        System.out.println(e); // 小米

        // 2、public int size():获取集合的大小（元素个数）
        System.out.println(list1.size()); // 4

        // 3、完成集合的遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        // 4、public E remove(int index):删除某个索引位置的元素值，并返回被删除的元素值。
        System.out.println(list1); // [java, mysql, 小米, 华为]
        String e2 = list1.remove(2);
        System.out.println(e2); // 小米
        System.out.println(list1); // [java, mysql, 华为]

        // 5、public boolean remove(Object o) :直接删除元素，删除成功返回true,失败返回false
        System.out.println(list1.remove("java"));
        System.out.println("5:"+ list1); // 5:[mysql, 华为, java]

        // 6、public E set(int index, E element):修改某个索引位置处的元素值。
        String e3 = list1.set(0, "苹果");
        System.out.println(e3); // mysql
        System.out.println("6:"+list1); // 6:[苹果, 华为, java]

    }
}
