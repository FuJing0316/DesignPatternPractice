package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/22
 * @Description: 不同的比较器
 * @Version: 1.0
 */
public interface ComparetorInterface<T> {
    int compare(T o1,T o2);
}
