package edu.seu.observer.observer;

import edu.seu.observer.entity.WeatherData;

public class CurrentConditions implements Observer{

    private final String name;
    private WeatherData data;

    public CurrentConditions(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherData data) {
        this.data = data;
        display();
    }

    private void display() {
        System.out.println(name);
        System.out.println(data);
    }
}
