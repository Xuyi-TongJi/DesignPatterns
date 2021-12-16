package edu.seu.command.command;

import edu.seu.command.receiver.TVReceiver;

public class TVOffCommand implements Command {

    private final TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
