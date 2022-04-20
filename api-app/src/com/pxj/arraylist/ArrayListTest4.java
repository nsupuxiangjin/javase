package com.pxj.arraylist;

import java.util.ArrayList;
// 遍历并删除元素的正确方案
public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
         // 有问题代码
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score<80) {
                scores.remove(i);
            }
        }
        System.out.println(scores); // [98, 66, 89, 50, 100]
        // 方案一
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80) {
                scores.remove(i);
                i--; // 删除成功笔记退一步，这样可以保证回到这个位置，如此不会跳过数据
            }
        }
        System.out.println(scores);
        // 方案二，后面倒着遍历就删除就可以
        for (int i = scores.size()-1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80) {
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
