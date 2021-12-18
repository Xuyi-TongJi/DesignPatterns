package edu.seu.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public void printStates() {
        int index = 0;
        for (Memento memento:
             mementoList) {
            System.out.println("state" + index + ":" + memento.getState());
            index ++;
        }
    }
}