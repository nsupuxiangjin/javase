package com.pxj.interface_implements;

public class Test {
    public static void main(String[] args) {
        // 理解接口的基本使用：被实现
        PingPongMan p = new PingPongMan("张继科");
        p.run();
        p.competition();
        p.rule();

    }
}
