package com.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fujing
 * @Date: 2021/10/5
 * @Description:
 * @Version: 1.0
 */
public class Child {
    private boolean isCry = false;
    List<Observes> observes = new ArrayList<Observes>();

    {
        observes.add(new Dad());
        observes.add(new Mom());
        observes.add(new Dog());
    }


    void wakeUp() {
        isCry = true;
        for (Observes observe : observes) {
            observe.wakeUpaction();
        }
    }


    public boolean isCry() {
        return isCry;
    }

    public void setCry(boolean cry) {
        isCry = cry;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
        child.isCry = true;
    }


}
