package com.tg.decorate.starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage01 = new EspressoBeverage();
        beverage01 = new SoyCondiment(beverage01);
        beverage01 = new MochaCondiment(beverage01);
        beverage01 = new WhipCondiment(beverage01);
        System.out.println("你购买的商品如下：" + beverage01.getDescription());
        System.out.println("共花费了：" + beverage01.cost());

    }
}
