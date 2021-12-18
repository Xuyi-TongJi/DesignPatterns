package edu.seu.mediator;

import edu.seu.mediator.colleague.Alarm;
import edu.seu.mediator.colleague.CoffeeMachine;
import edu.seu.mediator.colleague.TV;
import edu.seu.mediator.mediator.ConcreteMediator;
import edu.seu.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "myCoffeeMachine");
        Alarm alarm = new Alarm(mediator, "myAlarm");
        TV tv = new TV(mediator, "myTV");

        alarm.sendAlarm(0);
        alarm.sendAlarm(1);
    }
}