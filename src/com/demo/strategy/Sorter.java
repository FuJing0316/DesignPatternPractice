package com.demo.strategy;

import java.util.Arrays;

/**
 * @Author: fujing
 * @Date: 2021/9/21
 * @Description:
 * @Version: 1.0
 */
public class Sorter<T> {

    public void sort(T[] objects, ComparetorInterface comparetor) {
        for (int i = 0; i < objects.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < objects.length; j++) {
                minPos = comparetor.compare(objects[j], objects[minPos]) == -1 ? j : minPos;
            }

            //元素交换：根据较小元素的下表，进行元素位置交换
            T temp = objects[i];
            objects[i] = objects[minPos];
            objects[minPos] = temp;
        }
    }
}
