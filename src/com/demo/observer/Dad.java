package com.demo.observer;

/**
 * @Author: fujing
 * @Date: 2021/10/5
 * @Description:
 * @Version: 1.0
 */
public class Dad implements Observes {
    @Override
    public void wakeUpaction() {
        feed();
    }

    private void feed() {
        System.out.println("爸爸看到宝宝醒了，开始喂吃的。。。");
    }
}
