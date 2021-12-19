package edu.seu.state.concurrent.state;

import edu.seu.state.concurrent.context.Participant;
import edu.seu.state.concurrent.exception.OperationException;

public abstract class AbstractState implements State {

    protected final Participant participant;

    public AbstractState(Participant participant) {
        this.participant = participant;
    }

    @Override
    public boolean deduceMoney() {
        throw new OperationException("当前状态不可扣除积分！");
    }

    @Override
    public boolean raffle() {
        throw new OperationException("当前状态不可抽奖！");
    }

    @Override
    public boolean dispensePrize() {
        throw new OperationException("当前状态不可领取奖品！");
    }
}
