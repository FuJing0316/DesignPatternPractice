package com.demo.strategy;

/**
 * @Author: fujing
 * @Date: 2021/9/22
 * @Description:
 * @Version: 1.0
 */
public class Dog /*implements ComparableInterface<Dog>*/ {
    int age;

    public Dog(int age) {
        this.age = age;
    }

/*    @Override
    public int compareTo(Dog dog) {
        if (this.age < dog.age) return -1;
        if (this.age > dog.age) return 1;
        return 0;
    }*/

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
