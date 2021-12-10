package edu.seu.factory.simpleFactory.pizzaStoreImpove;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

public class NewPizza extends Pizza {

    public NewPizza() {
        this.name = "new Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("一种新的Pizza");
    }
}
