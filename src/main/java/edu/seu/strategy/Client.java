package edu.seu.strategy;

import edu.seu.strategy.context.*;
import edu.seu.strategy.strategyA.GoodFlyBehavior;
import edu.seu.strategy.strategyB.AQuackBehavior;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<AbstractDuck> ducks = new ArrayList<>();
        ducks.add(new PekingDuck());
        ducks.add(new ToyDuck());
        ducks.add(new WildDuck());
        ducks.add(new DiyDuck("自定义鸭子", new GoodFlyBehavior(), new AQuackBehavior()));
        for (AbstractDuck duck:
             ducks) {
            System.out.println("-----");
            duck.display();
            System.out.println("-----");
        }
    }
}
