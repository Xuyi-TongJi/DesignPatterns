package edu.seu.mediator.colleague;

import edu.seu.mediator.mediator.Mediator;

public abstract class Colleague {

    private final Mediator mediator;
    private final String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public String getName() {
        return name;
    }

    protected abstract void sendMessage(int stateChange);
}