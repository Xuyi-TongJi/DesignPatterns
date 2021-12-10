package edu.seu.factory.factoryMethod.order;

import edu.seu.factory.factoryMethod.pizza.BJCheesePizza;
import edu.seu.factory.factoryMethod.pizza.BJGreekPizza;
import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
