package edu.seu.state.singleThread.state;

import edu.seu.state.singleThread.context.Context;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState implements State {

    private final Context activity;

    public NoRaffleState(Context activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，您可以抽奖了");
        // 状态转换
        activity.setState("canRaffleState");
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分才能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("请先参加抽奖");
    }
}
