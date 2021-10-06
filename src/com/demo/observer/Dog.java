package com.demo.observer;

/**
 * @Author: fujing
 * @Date: 2021/10/5
 * @Description:
 * @Version: 1.0
 */
public class Dog implements Observes {
    @Override
    public void wakeUpaction() {
        call();
    }

    private void call() {
        System.out.println("大黄看到宝宝醒了，汪汪大叫。。。。");
    }
}
