package edu.seu.factory.factoryMethod.pizza;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class LDGreekPizza extends Pizza {

    public LDGreekPizza() {
        this.name = "LDGreek";
    }

    @Override
    public void prepare() {
        System.out.println("准备伦敦胡椒披萨");
    }
}
