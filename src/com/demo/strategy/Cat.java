package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/21
 * @Description:
 * @Version: 1.0
 */
public class Cat /*implements ComparableInterface<Cat>*/ {
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

/*    @Override
    public int compareTo(Cat c) {
        if (this.weight < c.weight) return -1;
        if (this.weight > c.weight) return 1;
        return 0;
    }*/
}
