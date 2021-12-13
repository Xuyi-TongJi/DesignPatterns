package edu.seu.decorator.concreteComponent;

import edu.seu.decorator.Coffee;

public class Decaf extends Coffee {

    public Decaf() {
        setDescription("脱因咖啡");
        setPrice(6.0f);
    }
}
