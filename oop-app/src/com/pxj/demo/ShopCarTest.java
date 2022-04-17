package com.pxj.demo;

import java.util.Scanner;

// 目标：购物车模块模拟
public class ShopCarTest {
    public static void main(String[] args) {
        // 1、定义商品类
        // 2、定义购物车对象：使用一个数组对象表示
        Goods[] shopCar = new Goods[100]; // [null,null...]
        // 3、搭建操作架构 ctrl+alt+t
        while (true) {
            System.out.println("请你选择如下操作命令进行操作：");
            System.out.print("添加商品到购物车：add" + "\t");
            System.out.print("查询商品：query" + "\t");
            System.out.print("修改商品购买数量：update" + "\t");
            System.out.print("结算购买上面的金额：pay"+ "\t");
            System.out.println("退出：exit");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                case "exit":
                    System.out.println("欢迎下次光临");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    public static void exit() {
    }

    public static void pay(Goods[] shopCar) {
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请输入要修改的商品id");
            int id = sc.nextInt();
            Goods good = getGoodsById(shopCar, id);
            if (good==null) {
                System.out.println("对不起没有购买商品");
            } else {
                System.out.println("请输入："+ good.name+ "商品的购买数量：");
                good.buyNum  = sc.nextInt();
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id){
                    return g;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("================查询购物车信息如下=================");
        System.out.println("id\t\t名称\t\t价格\t\t购物数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNum);
            } else {
                break;
            }
        }
    }

    /*
     * 添加商品到购物车
     * */
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请输入商品id");
        int id = sc.nextInt();
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品价格");
        double price = sc.nextDouble();
        System.out.println("请输入购买数量：");
        int buyNumber = sc.nextInt();
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNum = buyNumber;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品" + name + "添加成功");
    }
}
