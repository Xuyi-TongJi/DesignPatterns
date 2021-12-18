package edu.seu.mediator.mediator;

import edu.seu.mediator.colleague.Colleague;

public abstract class Mediator {

    /**
     * 注册Colleague对象，将其加入到管理Colleague对象的数据结构中
     * @param name 对象名称 Colleague.name:String
     * @param colleague Colleague对象
     */
    public abstract void register(String name, Colleague colleague);

    /**
     * 接收消息,由具体的colleague发出
     * @param stateChange 状态码
     * @param colleagueName Colleague.name:String
     */
    public abstract void getMessage(int stateChange, String colleagueName);

    /**
     * 发送消息
     */
    public abstract void sendMessage();
}
