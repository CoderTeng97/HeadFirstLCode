package com.tg.oop.duck.entity;

import com.tg.oop.duck.behavior.QuackBehavior;

/***
 * 鸭鸣器
 */
public class DuckCall {
    private QuackBehavior quackBehavior;



    public void display(){
        System.out.println("我是一个鸭鸣器");
    }

    public void performQuack(){
        System.out.println("我会呱呱叫");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
