package edu.seu.factory.simpleFactory.pizzaStore;

import edu.seu.factory.util.PizzaUtil;

// 违反了ocp原则，新增一个pizza种类时，OrderPizza也需要修改代码
// 创建Pizza的代码往往有多处，不易全部修改
/* 改进思路： 把Pizza对象封装到一个类中，这样，如果有新的Pizza种类时，
            只需要修改这个类即可，其他有创建到Pizza对象的代码就不需要修改
*/
public class OrderPizza {

    // Constructor 完成订购任务

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购Pizza的类型
        do {
            orderType = PizzaUtil.getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else {
                break;
            }
            // 输出pizza制作的过程
            PizzaUtil.makePizza(pizza);
        } while(true);
    }
}
