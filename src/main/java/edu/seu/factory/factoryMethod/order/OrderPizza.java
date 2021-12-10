package edu.seu.factory.factoryMethod.order;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;
import edu.seu.factory.util.PizzaUtil;

public abstract class OrderPizza {

    // Constructor
    public OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = PizzaUtil.getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                PizzaUtil.makePizza(pizza);
            } else {
                System.out.println("无该种类的Pizza");
                break;
            }
        } while(true);
    }

    // 定义一个抽象方法，createPizza，让各个工厂子类自己实现
    // 这是一个工厂方法
    public abstract Pizza createPizza(String orderType);
}
