package edu.seu.command.command;

import edu.seu.command.receiver.TVReceiver;

public class TVOnCommand implements Command {

    private final TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
