package edu.seu.state.singleThread.state;

import edu.seu.state.singleThread.context.Activity;

/**
 * 发放奖品的状态
 */
public class DispenseState implements State {

    private final Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("请先领取奖品，再尝试下一次抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("请先领取奖品，再尝试下一次抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("正在领取奖品,剩余奖品个数为:" + activity.getCount());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("奖品领取完毕");
        if (activity.getPrize() > 0) {
            // 奖品未领完
            activity.setState("noRaffleState");
        } else {
            // 奖品领完
            activity.setState("dispenseOutState");
        }
    }
}
