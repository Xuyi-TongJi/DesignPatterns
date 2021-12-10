package edu.seu.factory.simpleFactory.pizzaStoreImpove;


// 相当于客户端，发起订购任务
public class PizzaStore {
    public static void main(String[] args) {
        /*new OrderPizza(new SimpleFactory()); */
        new OrderPizza2();
        System.out.println("退出了程序");
    }
}
