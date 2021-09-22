package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/22
 * @Description:
 * @Version: 1.0
 */
public class DogAgeComparetor implements ComparetorInterface<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.age < o2.age) return -1;
        if (o1.age > o2.age) return 1;
        return 0;
    }
}
