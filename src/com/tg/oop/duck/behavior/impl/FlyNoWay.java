package com.tg.oop.duck.behavior.impl;

import com.tg.oop.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("什么都不做，也不会飞");
    }
}
