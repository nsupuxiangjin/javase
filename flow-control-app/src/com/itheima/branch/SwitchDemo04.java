package com.itheima.branch;

public class SwitchDemo04 {
    public static void main(String[] args) {
        // switch穿透性案例(月份天数查看器)
        // 需求用户输出月份可以展示该月份的天数。
        // 1、3、5、7、8、10、12月份31天
        // 2月份是闰年29天，非闰年28天
        // 4、6、9、11月份是30天
        int month = 7;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println(month+"月是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月是30天");
                break;
            case 2:
                System.out.println("闰年29天，非闰年28天");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
