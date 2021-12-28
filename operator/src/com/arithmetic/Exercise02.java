package com.arithmetic;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        * 1.需求：假设还有59天放假，问：还有xx个星期天零xx天
        * 2.思路分析
        * (1) 使用变量days保存天数
        * (2) 一个星期是7天 星期数：days/7 多少天 days%7
        * */
        int days = 59;
        int weeks = days / 7;
        int leftData = days % 7;
        System.out.println(days + "天合" + weeks + "星期零" + leftData + "天");

        /*
        * 1.需求
        *   定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。
        * 2.思路分析
        *   (1) 使用变量double fahrenheit存储华氏温度
        *   (2) 根据给定的公式计算出
        * */

        double fahrenheit = 234.0;
        double centigrade = 5.0/9*(fahrenheit-100);
        System.out.println(fahrenheit + "华氏温度="+ centigrade + "摄氏温度");
    }
}
