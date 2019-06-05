package com.tg.oop.duck.behavior.impl;

import com.tg.oop.duck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("火箭动力飞行");
    }
}
