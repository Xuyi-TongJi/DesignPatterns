package edu.seu.state.concurrent;

import edu.seu.state.concurrent.context.Activity;
import edu.seu.state.concurrent.context.Participant;

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(20);
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
        Thread t1 = new Thread(r1, "t1");
        Thread t2 = new Thread(r2, "t2");
        Thread t3 = new Thread(r3, "t3");
        t1.start();
        t2.start();
        t3.start();
        // Main Thread wait t1, t2, t3
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(activity.getCount());
    }

    public static void doActivity(Participant participant, Activity activity) {
        while (true) {
            if (participant.getCurrentState().deduceMoney()) {
                if (participant.getCurrentState().raffle()) {
                    if (!participant.getCurrentState().dispensePrize())
                        break;
                }
            } else {
                break;
            }
            // 增加context switch的可能性
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(participant.getCurrentState()); // DispenseOut
    }
}