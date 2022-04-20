package com.pxj.arraylist;

import java.util.ArrayList;

// 目标：创建ArrayList对象，代表集合容器，往里面添加元素
public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 1、创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        // 2、添加数据
        list.add("java");
        list.add(123);
        list.add(false);
        list.add('中');

        System.out.println(list);
        // 3、给指定索引位置插入元素
        list.add(1, "小米");
    }
}
