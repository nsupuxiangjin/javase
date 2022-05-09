package com.pxj.interface_implements;

// 实现类
public class PingPongMan implements SportMan, Law  {
    @Override
    public void run() {
        System.out.println(name + "必须跑步！");
    }

    @Override
    public void competition() {
        System.out.println(name + "要参加比赛！");
    }

    @Override
    public void rule() {
        System.out.println(name+"必须守法！");
    }

    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
