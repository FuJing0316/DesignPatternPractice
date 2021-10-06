package com.demo.spring_aop.v1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: fujing
 * @Date: 2021/10/6
 * @Description: 增强
 * @Version: 1.0
 */

public class TimeInterceptor {

    void befor() {
        System.out.println("interceptor method start: " + System.currentTimeMillis());
    }


    void after() {
        System.out.println("interceptor method end: " + System.currentTimeMillis());
    }
}
