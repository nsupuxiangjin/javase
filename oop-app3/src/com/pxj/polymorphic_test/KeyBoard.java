package com.pxj.polymorphic_test;

public class KeyBoard implements USB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+ "连接了~");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"扒出了~~");
    }
    // 独有功能
    public void keyDown() {
        System.out.println(name+ "键盘按下了~~");
    }
}
