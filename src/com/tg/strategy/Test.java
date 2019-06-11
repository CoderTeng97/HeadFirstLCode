package com.tg.strategy;

import com.tg.strategy.behavior.impl.FlyRocketPowered;
import com.tg.strategy.behavior.impl.Quack;
import com.tg.strategy.entity.DuckCall;
import com.tg.strategy.entity.MallardDuck;
import com.tg.strategy.entity.ModelDuck;

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
