package edu.seu.memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存当前状态到一个备忘录对象并返回
     * @return 备忘录对象
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录状态回复属性
     * @param memento 保存state的Memento对象
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}