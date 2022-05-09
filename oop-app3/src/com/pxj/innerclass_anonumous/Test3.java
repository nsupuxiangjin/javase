package com.pxj.innerclass_anonumous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 通过GUI编程 理解内部类真实使用场景
* */
public class Test3 {
    public static void main(String[] args) {
        // 1.创建窗口
        JFrame win = new JFrame("登陆界面");

        JPanel panel = new JPanel();

        win.add(panel);

        // 2.创建一个按钮对象
        JButton btn = new JButton("登陆");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了登陆");
                JOptionPane.showMessageDialog(win,"点击了登陆");
            }
        });

        // 3.把按钮对象添加到窗口上展示
        panel.add(btn);

        // 4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
