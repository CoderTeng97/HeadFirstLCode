package com.tg.strategy.behavior.impl;

import com.tg.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
