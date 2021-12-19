package edu.seu.state.singleThread.state;

import edu.seu.state.singleThread.context.Context;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState implements State {

    private final Context activity;

    public CanRaffleState(Context activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣除积分，可以参加抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int num = new Random().nextInt(2);
        if (num == 0) {
            activity.setState("dispenseState");
            return true;
        } else {
            activity.setState("noRaffleState");
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("请先完成抽奖");
    }
}
