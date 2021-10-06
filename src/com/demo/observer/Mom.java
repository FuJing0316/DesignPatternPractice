package com.demo.observer;

/**
 * @Author: fujing
 * @Date: 2021/10/5
 * @Description:
 * @Version: 1.0
 */
public class Mom implements Observes {
    @Override
    public void wakeUpaction() {
        hug();
    }

    private void hug() {
        System.out.println("妈妈看到宝宝醒了，抱起了宝宝。。。。");
    }
}
