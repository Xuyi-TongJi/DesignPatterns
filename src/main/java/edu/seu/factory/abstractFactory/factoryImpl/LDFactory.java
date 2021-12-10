package edu.seu.factory.abstractFactory.factoryImpl;

import edu.seu.factory.abstractFactory.AbsFactory;
import edu.seu.factory.factoryMethod.pizza.LDCheesePizza;
import edu.seu.factory.factoryMethod.pizza.LDGreekPizza;
import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
