package edu.seu.strategy.strategyA;

public class BadFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("飞翔技术不行");
    }
}
