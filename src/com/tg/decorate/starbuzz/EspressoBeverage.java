package com.tg.decorate.starbuzz;

/**
 * 浓缩咖啡
 */
public class EspressoBeverage extends Beverage{

    public EspressoBeverage() {
        description = "Espresso";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
