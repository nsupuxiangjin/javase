package com.pxj.innerclass_anonumous;

/*
* 目标：掌握匿名内部类的使用形式（语法）
* */
public class Test2 {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐的游泳~~~");
            }
        };

        Swimming t = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师快乐的游泳~~~");
            }
        };

        go(s);
        go(t);
    }

    public static void go(Swimming s) {
        System.out.println("开始~~~");
        s.swim();
        System.out.println("结束~~");
    }
}



interface Swimming{
    void swim();
}
