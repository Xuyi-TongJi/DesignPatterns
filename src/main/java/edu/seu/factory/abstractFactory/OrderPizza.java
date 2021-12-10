package edu.seu.factory.abstractFactory;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;
import edu.seu.factory.util.PizzaUtil;

public class OrderPizza {

    AbsFactory absFactory; // 聚合一个AbsFactory

    public OrderPizza(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;
        do {
            orderType = PizzaUtil.getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                PizzaUtil.makePizza(pizza);
            } else {
                System.out.println("订购失败");
                break;
            }
        } while(true);
    }
}
