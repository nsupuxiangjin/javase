package com.itheima.branch;

/*
 * 目标:学会使用if分支结构解决问题，理解其流程
 * */
public class IfDemo01 {
    public static void main(String[] args) {
        // 需求：心跳（60-100）之间是正常的，否则系统提示进一步检查
        // 格式：if(条件表达式){ 代码... }
        int hearBeate = 30;
        if (hearBeate < 60 || hearBeate > 100) {
            System.out.println("你的心跳数据是：" + hearBeate + "可能需要进一步检查!");
        }
        System.out.println("检查结束");

        // 格式2：if(条件表达式){ 代码...} else { 代码... }
        // 需求发红包
        double money = 5000;
        if (money >= 1314) {
            System.out.println("您当前红包发送成功~~~");
        } else {
            System.out.println("当前余额不足~~~~");
        }

        // 格式3： if(条件表达式){ 代码.. } else if(条件表达式) {代码...}... else{ 代码... }
        // 绩效系统：0-60 C 60-80 B 80-90 A 90-100 A+
        int score = 99;
        if (score >= 0 && score < 60) {
            System.out.println("您本月绩效：C");
        } else if (score >= 60 && score < 80) {
            System.out.println("您本月绩效：B");
        } else if (score >= 80 & score <= 90) {
            System.out.println("您本月绩效：A");
        } else if (score >= 90 & score <= 100) {
            System.out.println("您本月绩效：A+");
        } else {
            System.out.println("你输入的分数有问题");
        }
    }
}
