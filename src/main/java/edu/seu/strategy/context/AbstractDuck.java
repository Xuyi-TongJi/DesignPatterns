package edu.seu.strategy.context;

import edu.seu.strategy.strategyA.FlyBehavior;
import edu.seu.strategy.strategyB.QuackBehavior;

public abstract class AbstractDuck {

    // 也可以定义为可改变的Strategy，提供setter方法
    protected final String name;
    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public AbstractDuck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    protected void fly() {
        flyBehavior.fly();
    }

    protected void quack() {
        quackBehavior.quack();
    }

    protected final void swim() {
        System.out.println("所有鸭子都会游泳");
    }
}