package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/22
 * @Description:
 * @Version: 1.0
 */
public class CatWeightComparetor implements ComparetorInterface<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight < o2.weight) return -1;
        if (o1.weight > o2.weight) return 1;
        return 0;
    }
}
