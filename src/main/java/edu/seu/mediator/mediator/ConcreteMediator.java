package edu.seu.mediator.mediator;

import edu.seu.mediator.colleague.Alarm;
import edu.seu.mediator.colleague.CoffeeMachine;
import edu.seu.mediator.colleague.Colleague;
import edu.seu.mediator.colleague.TV;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者具体实现类，实现智能家居系统
 */
public class ConcreteMediator extends Mediator{

    // 管理Colleague对象的Data Structure
    private final Map<String, Colleague> colleagueMap;
    // 辅助Map
    private final Map<String, String> innerMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.innerMap = new HashMap<>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
        // 辅助innerMap
        if (colleague instanceof Alarm) {
            innerMap.put("Alarm", colleague.getName());
        } else if (colleague instanceof CoffeeMachine) {
            innerMap.put("CoffeeMachine", colleague.getName());
        } else if (colleague instanceof TV) {
            innerMap.put("TV", colleague.getName());
        }
    }

    // 具体中介者的核心方法
    // 1. 根据得到的消息，完成对应的任务
    // 2. 中介者在这个方法，协调各个具体的同事对象
    // 该系统中新增一个Colleague时，只需要修改这个方法
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            // 接收到闹钟发出的状态码为0或1的消息
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap
                        .get(innerMap.get("CoffeeMachine"))))
                        .startCoffee();
                ((TV)(colleagueMap.get(innerMap.get("TV"))))
                        .openTv();
            } else if (stateChange == 1) {
                ((TV)(colleagueMap.get(innerMap.get("TV"))))
                        .stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            // 接收到闹钟发出的状态码为0或1的消息
            // ...
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            // 接收到闹钟发出的状态码为0或1的消息
            if (stateChange == 0) {
                ((CoffeeMachine)(colleagueMap.get(innerMap.get("CoffeeMachine"))))
                        .finishCoffee();
            }
        }
    }

    @Override
    public void sendMessage() {
    }
}