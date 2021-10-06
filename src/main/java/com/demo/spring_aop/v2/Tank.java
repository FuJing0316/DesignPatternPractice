package com.demo.spring_aop.v2;

/**
 * @Author: fujing
 * @Date: 2021/10/6
 * @Description: 待增强对象（待增强的方法）
 * @Version: 1.0
 */
public class Tank {

    /**
     * 模拟坦克移动一会
     */
    public void move(){
        System.out.println("tank move calcal...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
