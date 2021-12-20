package edu.seu.strategy.context;

import edu.seu.strategy.strategyA.GoodFlyBehavior;
import edu.seu.strategy.strategyB.AQuackBehavior;

public final class WildDuck extends AbstractDuck{

    // 构造方法中聚合StrategyA和B，即选择策略
    public WildDuck() {
        super("野鸭", new GoodFlyBehavior(), new AQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println(this.name);
        this.fly();
        this.quack();
        this.swim();
    }
}