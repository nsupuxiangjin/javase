package com.itheima.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        // 目标：理解break 和 continue的作用
        // 场景：假如你有个老婆，你犯错了，你老婆罚你做5天家务，每天都是洗碗，但是洗到第三天的时候，心软原谅你了不用洗了
        for (int i = 0; i < 5; i++) {
            System.out.println("洗碗~~~~");
            if (i==2){
                break; // 跳出并结束当前的执行~~~
            }
        }

        System.out.println("------------------------------------");

        // 场景：假如你有个老婆，你犯错了，你老婆罚你做5天家务，但是洗到第三天的时候,原谅你今天不洗了，但是后面4、5天要洗
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                continue;
            }
            System.out.println("洗碗~~~~" + i);
        }
    }
}
