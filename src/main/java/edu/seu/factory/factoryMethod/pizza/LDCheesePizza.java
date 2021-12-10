package edu.seu.factory.factoryMethod.pizza;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class LDCheesePizza extends Pizza {

    public LDCheesePizza() {
        this.name = "伦敦奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备伦敦奶酪披萨");
    }
}
