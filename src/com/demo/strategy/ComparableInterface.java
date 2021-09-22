package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/22
 * @Description:  所有要比较的对象，均要实现该接口
 * @Version: 1.0
 */
public interface ComparableInterface<T> {

    public int compareTo(T o);

}
