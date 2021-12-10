package edu.seu.factory.simpleFactory.pizzaStoreImpove;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;
import edu.seu.factory.util.PizzaUtil;

// 另一个需要使用Pizza类的类
// 使用SimpleFactory的static方法生产
public class OrderPizza2 {

    private Pizza pizza = null;

    public OrderPizza2() {
        String orderType = null;
        do {
            orderType = PizzaUtil.getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {
                PizzaUtil.makePizza(pizza);
            } else {
                System.out.println("无此类型的Pizza");
                break;
            }
        } while(true);
    }
}
