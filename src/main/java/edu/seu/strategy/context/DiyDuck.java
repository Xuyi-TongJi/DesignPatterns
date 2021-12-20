package edu.seu.strategy.context;

import edu.seu.strategy.strategyA.FlyBehavior;
import edu.seu.strategy.strategyB.QuackBehavior;

public final class DiyDuck extends AbstractDuck{

    public DiyDuck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(name, flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("l am a DIY Duck");
        System.out.println(this.name);
        this.fly();
        this.quack();
        this.swim();
    }
}