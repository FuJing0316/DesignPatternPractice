package com.demo.spring_aop.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: fujing
 * @Date: 2021/10/6
 * @Description: 增强
 * @Version: 1.0
 */
@Aspect
public class TimeProxy {
    @Before("execution(void com.demo.spring_aop.v2.Tank.move())")
    public void befor() {
        System.out.println("interceptor method start: " + System.currentTimeMillis());
    }

    @After("execution(void com.demo.spring_aop.v2.Tank.move())")
    public void after() {
        System.out.println("interceptor method end: " + System.currentTimeMillis());
    }
}
