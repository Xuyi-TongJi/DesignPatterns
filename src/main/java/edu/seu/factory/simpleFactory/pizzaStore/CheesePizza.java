package edu.seu.factory.simpleFactory.pizzaStore;

public class CheesePizza extends Pizza{

    public CheesePizza() {
        this.name = "CheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨");
    }
}
