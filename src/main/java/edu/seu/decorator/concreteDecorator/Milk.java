package edu.seu.decorator.concreteDecorator;

import edu.seu.decorator.Decorator;
import edu.seu.decorator.Drink;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(2.0f);
    }
}
