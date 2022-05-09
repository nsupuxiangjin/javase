package com.pxj.polymorphic_test;

/*
* 电脑类
* */
public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println(name+"开机了~~");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
    }
    /*
    * 提供安装USB设置的入口
    * */
    public void installUSB(USB usb) {
        // 多态：usb == 可能是鼠标，也可以是键盘
        usb.connect();
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.mousemove();
        }
        usb.unconnect();
    }
}
