package edu.seu.command.receiver;

/**
 *  命令接受实现类，真正执行动作的类
 */
public class LightReceiver implements Receiver{

    @Override
    public void on() {
        System.out.println("电灯打开了..");
    }

    @Override
    public void off() {
        System.out.println("电灯关闭了..");
    }
}
