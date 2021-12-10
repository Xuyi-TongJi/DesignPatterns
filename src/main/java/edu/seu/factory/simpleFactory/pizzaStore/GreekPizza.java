package edu.seu.factory.simpleFactory.pizzaStore;

public class GreekPizza extends Pizza{

    public GreekPizza() {
        this.name = "GreekPizza";
    }

    @Override
    public void prepare() {
        System.out.println("准备希腊披萨");
    }
}
