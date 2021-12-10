package edu.seu.factory.factoryMethod.pizza;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class BJGreekPizza extends Pizza {

    public BJGreekPizza() {
        this.name = "BJGreek";
    }

    @Override
    public void prepare() {
        System.out.println("准备北京胡椒披萨");
    }
}
