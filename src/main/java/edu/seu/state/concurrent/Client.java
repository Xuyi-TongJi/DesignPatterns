package edu.seu.state.concurrent;

import edu.seu.state.concurrent.context.Activity;
import edu.seu.state.concurrent.context.Participant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(5);
        Runnable r1 = new Runnable() {
            public void run() {
                Participant participant = new Participant(activity);
                doActivity(participant, activity);
            }
        };
        Runnable r2 = new Runnable() {
            public void run() {
                Participant participant = new Participant(activity);
                doActivity(participant, activity);
            }
        };
        Runnable r3 = new Runnable() {
            public void run() {
                Participant participant = new Participant(activity);
                doActivity(participant, activity);
            }
        };
        new Thread(r1, "t1").start();
        new Thread(r2, "t2").start();
        new Thread(r3, "t3").start();
    }

    public static void doActivity(Participant participant, Activity activity) {
        while (true) {
            System.out.println("-----------------");
            if (participant.getCurrentState().deduceMoney()) {
                if (participant.getCurrentState().raffle()) {
                    if (!participant.getCurrentState().dispensePrize())
                        break;
                } else {
                    continue;
                }
            } else {
                break;
            }
            System.out.println("-----------------");
        }
        System.out.println(participant.getCurrentState());
    }
}
