package com.tg.oop.duck.behavior.impl;

import com.tg.oop.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("正在飞行");
    }
}
