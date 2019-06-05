package com.tg.oop.duck.entity;

import com.tg.oop.duck.behavior.impl.FlyWithWings;
import com.tg.oop.duck.behavior.impl.Quack;

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
