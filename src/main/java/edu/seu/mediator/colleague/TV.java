package edu.seu.mediator.colleague;

import edu.seu.mediator.mediator.Mediator;

public class TV extends Colleague{

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void openTv() {
        System.out.println("open TV...");
    }

    public void stopTv() {
        System.out.println("stop Tv...");
    }

    @Override
    protected void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}
