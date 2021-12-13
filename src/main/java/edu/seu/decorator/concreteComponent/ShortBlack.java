package edu.seu.decorator.concreteComponent;

import edu.seu.decorator.Coffee;

public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDescription("浓缩咖啡");
        setPrice(10.5f);
    }
}
