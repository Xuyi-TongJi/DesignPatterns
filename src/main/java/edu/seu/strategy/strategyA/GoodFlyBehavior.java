package edu.seu.strategy.strategyA;

public class GoodFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("飞翔技术较好");
    }
}
