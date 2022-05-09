package com.pxj.interface_jdk8;

public interface SportManInter {

    // 1.默认方法，必须使用default修饰，默认使用public修饰
    // 默认方法，接口不能创建对象，这个方法智能过继给了实现类，由实现类对象调用
    default void run(){
        System.out.println("跑的快！！");
    }

    // 2.静态方法，必须使用static修饰
    // 接口的静态方法必须接口名，
    static void study() {
        System.out.println("学习呀呀呀呀！！！");
    }

    // 3.私有方法，jdk1.9k开始
}

class PingPongMan implements SportManInter {

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();

        SportManInter.study();
    }
}
