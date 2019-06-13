package com.tg.decorate.starbuzz;

public class MochaCondiment extends CondimentDecoreate{
    Beverage beverage;

    public MochaCondiment(Beverage beverage) {
        this.beverage =  beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .20 + beverage.cost();
    }
}
