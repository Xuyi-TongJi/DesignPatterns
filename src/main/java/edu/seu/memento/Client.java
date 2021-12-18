package edu.seu.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("优");
        careTaker.add(new Memento(originator.getState()));
        originator.setState("良");
        careTaker.add(new Memento(originator.getState()));
        originator.setState("中");
        careTaker.add(new Memento(originator.getState()));
        originator.setState("及格");
        careTaker.add(new Memento(originator.getState()));
        originator.setState("不及格");
        careTaker.add(new Memento(originator.getState()));

        System.out.println(originator.getState()); // 当前记录
        System.out.println("--------------------");
        careTaker.printStates(); // 历史记录
        // 恢复到状态0
        System.out.println("--------------------");
        originator.setState(careTaker.get(0).getState());
        System.out.println(originator.getState());
    }
}
