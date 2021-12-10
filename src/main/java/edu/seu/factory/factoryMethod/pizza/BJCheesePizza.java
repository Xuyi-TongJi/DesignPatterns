package edu.seu.factory.factoryMethod.pizza;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class BJCheesePizza extends Pizza {

    public BJCheesePizza() {
        this.name = "BJCheese";
    }

    @Override
    public void prepare() {
        System.out.println("准备北京奶酪披萨");
    }
}
