package com.tg.oop.duck.behavior.impl;

import com.tg.oop.duck.behavior.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
