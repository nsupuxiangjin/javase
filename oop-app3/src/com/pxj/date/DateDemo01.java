package com.pxj.date;

import java.util.Date;

public class DateDemo01 {
    // 目标：学会使用Date类处理时间，获取时间信息
    public static void main(String[] args) {
        // 1、创建一个Date类的对象：代表此时此刻日期时间对象
        Date d = new Date();
        System.out.println(d); // Mon May 09 17:04:54 CST 2022

        // 2、获取时间毫秒值
        long time = d.getTime();
        System.out.println(time);

    }
}
