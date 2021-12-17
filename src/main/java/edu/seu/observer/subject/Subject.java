package edu.seu.observer.subject;

import edu.seu.observer.entity.WeatherData;
import edu.seu.observer.observer.Observer;

/**
 * 被依赖接口，管理所有订阅的观察者
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
