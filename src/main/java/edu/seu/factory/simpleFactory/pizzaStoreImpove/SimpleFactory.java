package edu.seu.factory.simpleFactory.pizzaStoreImpove;

import edu.seu.factory.simpleFactory.pizzaStore.CheesePizza;
import edu.seu.factory.simpleFactory.pizzaStore.GreekPizza;
import edu.seu.factory.simpleFactory.pizzaStore.Pizza;

// 生产Pizza类的简单工厂类（静态工厂类）
/*
    简单工厂模式，即静态工厂模式。
    新增功能（Pizza种类）时，不需要更改OrderPizza类的代码，只需要修改工厂类的代码
 */
public class SimpleFactory {

    // 根据orderType返回对应Pizza对象
    public Pizza createPizza(String orderType) {
        return create(orderType);
    }

    // 也可以使用静态方法
    public static Pizza createPizza2(String orderType) {
        return create(orderType);
    }

    private static Pizza create(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        }
        // 新增一种类型的Pizza
        else if (orderType.equals("new")) {
            pizza = new NewPizza();
        }
        return pizza;
    }
}
