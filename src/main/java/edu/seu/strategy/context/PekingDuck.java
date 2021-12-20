package edu.seu.strategy.context;

import edu.seu.strategy.strategyA.BadFlyBehavior;
import edu.seu.strategy.strategyB.BQuackBehavior;

public final class PekingDuck extends AbstractDuck{

    public PekingDuck() {
        super("北京鸭子", new BadFlyBehavior(), new BQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println(this.name);
        this.fly();
        this.quack();
        this.swim();
    }
}
