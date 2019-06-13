package com.tg.decorate.starbuzz;

public class SoyCondiment extends CondimentDecoreate{
    Beverage beverage;

    public SoyCondiment(Beverage beverage) {
        this.beverage =  beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .50 + beverage.cost();
    }
}
