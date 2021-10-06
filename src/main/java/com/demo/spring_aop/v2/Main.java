package com.demo.spring_aop.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: fujing
 * @Date: 2021/10/6
 * @Description:  spring aop test (注解)
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext config =  new ClassPathXmlApplicationContext("auto-app.xml");
        Tank tank = (Tank) config.getBean("tank");
        tank.move();
    }
}
