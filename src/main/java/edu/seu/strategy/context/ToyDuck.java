package edu.seu.strategy.context;

import edu.seu.strategy.strategyA.NoFlyBehavior;
import edu.seu.strategy.strategyB.NoQuackBehavior;

public final class ToyDuck extends AbstractDuck{

    public ToyDuck() {
        super("玩具鸭", new NoFlyBehavior(), new NoQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println(this.name);
        this.fly();
        this.quack();
        this.swim();
    }
}