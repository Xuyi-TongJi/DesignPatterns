package edu.seu.mediator.colleague;

import edu.seu.mediator.mediator.Mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startCoffee() {
        System.out.println("start coffee..");
        try {
            Thread.sleep(3000);
            sendMessage(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void finishCoffee() {
        System.out.println("finish coffee..");
    }

    @Override
    protected void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}
