package edu.seu.decorator;

import edu.seu.decorator.concreteComponent.Decaf;
import edu.seu.decorator.concreteDecorator.Milk;

public class Client {
    public static void main(String[] args) {
        Drink drink = new Milk(new Milk(new Decaf()));
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());

        // 不加装饰器
        Drink drink1 = new Decaf();
        System.out.println(drink1.cost());
        System.out.println(drink1.getDescription());
    }
}
