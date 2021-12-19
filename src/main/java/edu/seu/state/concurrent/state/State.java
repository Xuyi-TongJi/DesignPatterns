package edu.seu.state.concurrent.state;

/**
 * 状态接口
 */
public interface State {

    /**
     * 扣除积分
     */
    boolean deduceMoney();

    /**
     * 是否抽中奖品
     * @return boolean
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    boolean dispensePrize();
}
