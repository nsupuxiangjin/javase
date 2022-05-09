package com.pxj.polymorphic_test;

public class Mouse implements USB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "接入了~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "扒出了~");
    }

    // 独有功能，鼠标移动
    public void mousemove() {
        System.out.println(name + "鼠标移动了~");
    }
}
