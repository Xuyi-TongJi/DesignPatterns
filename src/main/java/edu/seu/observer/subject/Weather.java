package edu.seu.observer.subject;

import edu.seu.observer.entity.WeatherData;
import edu.seu.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject{

    private final List<Observer> observerList = new ArrayList<>();
    private WeatherData data;

    protected WeatherData getData() {
        return data;
    }

    public void setData(WeatherData data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:
                observerList) {
            observer.update(this.getData());
        }
    }
}
