package edu.seu.command.command;

import edu.seu.command.receiver.LightReceiver;

public class LightOnCommand implements Command {

    private final LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 真正执行操作的是命令的接收者
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
