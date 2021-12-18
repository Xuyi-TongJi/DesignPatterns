package edu.seu.mediator.colleague;

import edu.seu.mediator.mediator.Mediator;

public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // 在创建该同事对象时，将自己放入到ConcreteMediator管理的集合中
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    /**
     * Colleague发送消息，即中介者接收消息
     * @param stateChange 状态码
     */
    @Override
    protected void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}