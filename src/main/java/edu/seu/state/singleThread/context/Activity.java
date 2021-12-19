package edu.seu.state.singleThread.context;

import edu.seu.state.singleThread.state.State;
import edu.seu.state.singleThread.state.*;

import java.util.HashMap;
import java.util.Map;

public class Activity implements Context {

    private State currentState;
    private final Map<String, State> activityStates = new HashMap<>();
    private int count;

    public Activity(int count) {
        this.count = count;
        // 构造时设置所有状态
        activityStates.put("canRaffleState", new CanRaffleState(this));
        activityStates.put("noRaffleState", new NoRaffleState(this));
        activityStates.put("dispenseState", new DispenseState(this));
        activityStates.put("dispenseOutState", new DispenseOutState(this));
        // 设置初始状态
        this.currentState = activityStates.get("noRaffleState");
    }

    // 读操作可以并发
    @Override
    public State getCurrentState() {
        return currentState;
    }

    @Override
    public void setState(String stateName) {
        this.currentState = activityStates.get(stateName);
    }

    public int getPrize() {
        // count > 0获取奖品成功
        return -- count;
    }

    public int getCount() {
        return count;
    }
}