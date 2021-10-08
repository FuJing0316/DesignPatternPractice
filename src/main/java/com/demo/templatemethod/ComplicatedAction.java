package com.demo.templatemethod;

/**
 * @Author: fujing
 * @Date: 2021/10/8
 * @Description: 两个抽象方法是要子类去实现的，同时非抽象方法又约定了子类实现两个方法后的执行顺序，起到了模板作用
 * @Version: 1.0
 */
public abstract class ComplicatedAction {
    public abstract void operate1();
    public abstract void operate2();

    /**
     * 约定了子类实现oper1和oper2的执行顺序
     */
    public void defaultOper(){
        operate1();
        operate2();
    }
}
