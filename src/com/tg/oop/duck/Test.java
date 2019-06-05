package com.tg.oop.duck;

import com.tg.oop.duck.behavior.impl.FlyRocketPowered;
import com.tg.oop.duck.behavior.impl.Quack;
import com.tg.oop.duck.entity.DuckCall;
import com.tg.oop.duck.entity.MallardDuck;
import com.tg.oop.duck.entity.ModelDuck;

public class Test {
    public static void main(String arg[]){
        /**默认的*/
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        /**可动态设置Behavior行为类*/
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.display();
        modelDuck.performFly();

        /**鸭鸣器*/
        DuckCall duckCall = new DuckCall();
        duckCall.display();
        duckCall.setQuackBehavior(new Quack());
    }
}
