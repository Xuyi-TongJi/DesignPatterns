package edu.seu.state.singleThread.state;

import edu.seu.state.singleThread.context.Activity;

public class DispenseOutState implements State {

    private final Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品已经领完，活动结束");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经领完，活动结束");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已经领完，活动结束");
    }
}
