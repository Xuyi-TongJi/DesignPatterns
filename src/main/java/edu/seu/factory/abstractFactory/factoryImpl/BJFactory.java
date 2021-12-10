package edu.seu.factory.abstractFactory.factoryImpl;

import edu.seu.factory.abstractFactory.AbsFactory;
import edu.seu.factory.factoryMethod.pizza.BJCheesePizza;
import edu.seu.factory.factoryMethod.pizza.BJGreekPizza;
import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
