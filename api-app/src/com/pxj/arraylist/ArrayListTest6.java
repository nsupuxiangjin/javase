package com.pxj.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// 学生信息搜索
public class ArrayListTest6 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1101,"小红",23,"护理一班"));
        students.add(new Student(1102,"小名",24,"计算机二班"));
        students.add(new Student(1103,"小黑",21,"英语三班"));
        students.add(new Student(1104,"小阿",26,"英语三班"));
        // 变量展示学生信息
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getStuClass());
        }
        // 4、定义方法按照学号搜索功能
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要查找的学生编号：");
            int number = sc.nextInt();
            Student s = getStudentById(students, number);
            if (s != null) {
                System.out.println(s.getNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getStuClass());
                break;
            } else {
                System.out.println("没有找到此学生！");
            }
        }


    }

    private static Student getStudentById(ArrayList<Student> students, int stuNum) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getNumber() == stuNum) {
                return student;
            }
        }
        return null;
    }
}
