package edu.seu.decorator.concreteDecorator;

import edu.seu.decorator.Decorator;
import edu.seu.decorator.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        // Decorator也是Drink的子类
        setDescription("巧克力");
        setPrice(3.0f);
    }
}
