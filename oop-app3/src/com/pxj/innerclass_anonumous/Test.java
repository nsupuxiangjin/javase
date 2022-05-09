package com.pxj.innerclass_anonumous;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑动快~~~");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}
