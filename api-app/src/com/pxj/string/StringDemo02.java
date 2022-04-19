package com.pxj.string;

public class StringDemo02 {
    public static void main(String[] args) {
        // 方式一：直接使用双引号得到字符串对象
        String name = "我爱你中国";
        // 方式二：通过构造器
        // 1、public String():创建一个空白字符串（几乎用）
        String s1 = new String();

        // 2、public String(String):几乎不用
        String s2 = new String("我是中国人");
        System.out.println(s2);

        // 3、public String(char[] c):根据字符数组，来创建字符串对象
        char[] chars = {'a', 'b', '中', '国'};
        String s3 = new String(chars);
        System.out.println(s3); // ab中国

        // 3、public String(byte[] c):根据字节数组，来创建字符串对象
        byte[] bytes = {97, 98, 99};
        String s4 = new String(bytes);
        System.out.println(s4); // abc

    }
}
