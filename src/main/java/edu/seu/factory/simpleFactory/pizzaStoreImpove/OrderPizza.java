package edu.seu.factory.simpleFactory.pizzaStoreImpove;

import edu.seu.factory.simpleFactory.pizzaStore.Pizza;
import edu.seu.factory.util.PizzaUtil;

public class OrderPizza {

    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    // 聚合关系（也可以使用组合关系）
    public OrderPizza(SimpleFactory simpleFactory) {
        this.setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = PizzaUtil.getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                PizzaUtil.makePizza(pizza);
            } else {
                System.out.println("无此类型的pizza");
                break;
            }
        } while(true);
    }

}
