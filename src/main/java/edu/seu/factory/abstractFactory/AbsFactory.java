package edu.seu.factory.abstractFactory;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

// 抽象工厂模式的抽象层
public interface AbsFactory {

    // 让工厂子类具体实现
    Pizza createPizza(String orderType);
}
