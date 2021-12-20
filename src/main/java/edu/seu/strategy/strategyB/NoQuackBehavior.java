package edu.seu.strategy.strategyB;

public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
