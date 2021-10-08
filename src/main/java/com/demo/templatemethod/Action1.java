package com.demo.templatemethod;

/**
 * @Author: fujing
 * @Date: 2021/10/8
 * @Description:
 * @Version: 1.0
 */
public class Action1 extends ComplicatedAction {
    @Override
    public void operate1() {
        System.out.println("子类实现父类模板方法1");
    }

    @Override
    public void operate2() {
        System.out.println("子类实现父类模板方法2");
    }
}
