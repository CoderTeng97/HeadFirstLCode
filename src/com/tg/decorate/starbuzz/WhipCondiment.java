package com.tg.decorate.starbuzz;

public class WhipCondiment extends CondimentDecoreate{
    Beverage beverage;

    public WhipCondiment(Beverage beverage) {
        this.beverage =  beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .80 + beverage.cost();
    }
}
