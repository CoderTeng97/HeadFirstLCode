package com.tg.strategy.behavior.impl;

import com.tg.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("火箭动力飞行");
    }
}
