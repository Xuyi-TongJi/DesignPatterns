package edu.seu.command.receiver;

public class TVReceiver implements  Receiver{

    @Override
    public void on() {
        System.out.println("电视打开了..");
    }

    @Override
    public void off() {
        System.out.println("电视关闭了..");
    }
}
