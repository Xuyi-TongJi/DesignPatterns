package edu.seu.factory.factoryMethod;

import edu.seu.factory.factoryMethod.order.BJOrderPizza;
import edu.seu.factory.factoryMethod.order.LDOrderPizza;

// 客户端
public class PizzaStore {
    public static void main(String[] args) {
        new BJOrderPizza();
        System.out.println("--------");
        new LDOrderPizza();
        System.out.println("end");
    }
}
