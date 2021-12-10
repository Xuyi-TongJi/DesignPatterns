package edu.seu.factory.factoryMethod.order;

import edu.seu.factory.factoryMethod.pizza.LDCheesePizza;
import edu.seu.factory.factoryMethod.pizza.LDGreekPizza;
import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
