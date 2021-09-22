package com.demo.strategy;

import java.util.Arrays;

public class Main {

    /**
     * 目的：要做一个排序功能，练习策略模式
     * 1、定义好一个sorter（选择排序算法）
     * 2、定义要排序的对象--> 扩展：一个可比较的对象（一个接口，提供compareTo方法即可。里式替换原则：所有使用父类的地方，必须要能够透明的使用子类）
     *
     * @param args
     */
    public static void main(String[] args) {
//        int[] arr = {4, 9, 2, 1, 3};
        Cat[] cats = {new Cat(4, 3), new Cat(1, 5), new Cat(5, 1),new Cat(3,6)};
        Dog[] dogs = {new Dog(4), new Dog(1), new Dog(5),new Dog(3)};
        Sorter sorter = new Sorter();
//        sorter.sort(dogs, new DogAgeComparetor());
//        sorter.sort(cats, new CatWeightComparetor());//猫的体重比较器
        sorter.sort(cats, new CatHeightComparetor());//猫的身高比较器

        System.out.println(Arrays.toString(cats));

    }
}
