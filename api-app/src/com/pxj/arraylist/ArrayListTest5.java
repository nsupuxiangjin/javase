package com.pxj.arraylist;

import java.util.ArrayList;

// 定义集合存储三部电影，并依次展示出来
public class ArrayListTest5 {
    public static void main(String[] args) {
        Movie m1 = new Movie("西游记",9.5,"孙悟空");
        Movie m2 = new Movie("三国演义",9.4,"诸葛亮");
        Movie m3 = new Movie("水浒传",9.0,"宋江");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("电影名称："+ m.getName());
            System.out.println("评分："+ m.getScore());
            System.out.println("主演："+ m.getActor());
            System.out.println("-------------");
        }
    }
}
