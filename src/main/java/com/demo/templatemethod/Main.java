package com.demo.templatemethod;

/**
 * @Author: fujing
 * @Date: 2021/10/8
 * @Description:
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ComplicatedAction complicatedAction = new Action1();
        complicatedAction.defaultOper();//调用该方法会按照模板约定的执行顺序执行
    }
}
