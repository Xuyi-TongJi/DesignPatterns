package edu.seu.state.concurrent.context;

import edu.seu.state.concurrent.state.AbstractState;
import edu.seu.state.concurrent.state.State;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 多线程下的状态模式Context类，有多种状态，每种状态对应一组方法
 * 参与者类，多个参与者参与同一场活动，共享剩余奖品个数这个共享变量
 */
public class Participant implements Context {

    private State currentState;
    private final Map<String, State> statesMap = new HashMap<>();
    private final Activity activity;

    public Participant(Activity activity) {
        this.activity = activity;
        // 构造时设置所有状态
        statesMap.put("noRaffleState", new NoRaffleState(this));
        statesMap.put("canRaffleState", new CanRaffleState(this));
        statesMap.put("dispenseState", new DispenseState(this));
        statesMap.put("dispenseOutState", new DispenseOutState(this));
        // 设置初始状态
        this.currentState = statesMap.get("noRaffleState");
    }

    @Override
    public State getCurrentState() {
        return currentState;
    }

    private void setState(String stateName) {
        this.currentState = statesMap.get(stateName);
    }

    private Activity getActivity() {
        return activity;
    }

    private int getCount() {
        return this.activity.getCount();
    }

    private static class NoRaffleState extends AbstractState{

        public NoRaffleState(Participant participant) {
            super(participant);
        }

        @Override
        public boolean deduceMoney() {
            synchronized (super.participant.getActivity()) {
                if (participant.getCount() <= 0) {
                    System.out.println(Thread.currentThread().getName() + "奖品已经领完");
                    super.participant.setState("dispenseOutState");
                    return false;
                } else {
                    System.out.println(Thread.currentThread().getName() + "已经扣除50积分，可以开始抽奖");
                    super.participant.setState("canRaffleState");
                    return true;
                }
            }
        }
    }

    private static class CanRaffleState extends AbstractState {

        public CanRaffleState(Participant participant) {
            super(participant);
        }

        @Override
        public boolean raffle() {
            synchronized (super.participant.getActivity()) {
                System.out.println(Thread.currentThread().getName() + "正在开始抽奖");
                int num = new Random().nextInt(2);
                if (num == 0) {
                    // 抽中
                    System.out.println(Thread.currentThread().getName() + "恭喜中奖，请领奖");
                    this.participant.setState("dispenseState");
                } else {
                    // 未抽中
                    System.out.println(Thread.currentThread().getName() + "很遗憾未中奖，可再试一次");
                    this.participant.setState("noRaffleState");
                    return false;
                }
                return true;
            }
        }
    }

    private static class DispenseState extends AbstractState{

        public DispenseState(Participant participant) {
            super(participant);
        }

        @Override
        public boolean dispensePrize() {
            synchronized (super.participant.getActivity()) {
                if (super.participant.getCount() <= 0) {
                    System.out.println(Thread.currentThread().getName() + "抱歉，奖品已被领完");
                    super.participant.setState("dispenseOutState");
                    return false;
                }
                System.out.println(Thread.currentThread().getName() + "开始领取奖品");
                System.out.println(Thread.currentThread().getName() +
                        "奖品已经领取，剩余" + super.participant.getCount() + "件");
                if (super.participant.getActivity().getPrize()) {
                    super.participant.setState("dispenseOutState");
                    return false;
                } else {
                    super.participant.setState("noRaffleState");
                    return true;
                }
            }
        }
    }

    /**
     * 终止状态
     */
    private static class DispenseOutState extends AbstractState{

        public DispenseOutState(Participant participant) {
            super(participant);
        }

        @Override
        public String toString() {
            return "DispenseOut";
        }
    }
}