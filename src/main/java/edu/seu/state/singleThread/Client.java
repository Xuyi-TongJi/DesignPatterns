package edu.seu.state.singleThread;

import edu.seu.state.singleThread.context.Activity;
import edu.seu.state.singleThread.state.DispenseOutState;
import edu.seu.state.singleThread.state.DispenseState;

/**
 * 单线程实现状态模式
 */
public class Client {
    public static void main(String[] args) {
        doActivity(new Activity(5));
    }

    public static void doActivity(Activity activity) {
        while (!(activity.getCurrentState() instanceof DispenseOutState)) {
            activity.getCurrentState().deduceMoney();
            activity.getCurrentState().raffle();
            if (activity.getCurrentState() instanceof DispenseState) {
                activity.getCurrentState().dispensePrize();
            }
            System.out.println("-------------------");
        }
        System.out.println("奖品全部领取完毕");
    }
}
