package com.tg.strategy.behavior.impl;

import com.tg.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("正在飞行");
    }
}
