package com.tg.strategy.entity;

import com.tg.strategy.behavior.impl.FlyWithWings;
import com.tg.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior =new FlyWithWings();
    }



    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
