package com.tg.decorate.starbuzz;

/**
 * 星巴兹 饮品类
 */
public abstract class Beverage {

    String description = "Unknow Beverage";
    public String getDescription(){
        return description;
    }

    public abstract Double cost();
}
