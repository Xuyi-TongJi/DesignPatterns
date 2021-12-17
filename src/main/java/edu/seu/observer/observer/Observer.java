package edu.seu.observer.observer;

import edu.seu.observer.entity.WeatherData;

/**
 *  观察者接口，由观察者实现
 */
public interface Observer {

    void update(WeatherData data);
}
