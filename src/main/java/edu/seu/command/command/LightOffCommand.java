package edu.seu.command.command;

import edu.seu.command.receiver.LightReceiver;

public class LightOffCommand implements Command {

    private final LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
