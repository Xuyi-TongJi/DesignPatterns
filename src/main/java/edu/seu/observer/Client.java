package edu.seu.observer;

import edu.seu.observer.entity.WeatherData;
import edu.seu.observer.observer.CurrentConditions;
import edu.seu.observer.subject.Weather;

public class Client {
    public static void main(String[] args) {
        CurrentConditions sina = new CurrentConditions("sina");
        CurrentConditions tecent = new CurrentConditions("tecent");
        Weather weather = new Weather();
        weather.registerObserver(sina);
        weather.registerObserver(tecent);

        WeatherData weatherData = new WeatherData(26.5f, 100, 0.7f);
        weather.setData(weatherData);

        WeatherData weatherData1 = new WeatherData(10.5f, 102, 0.5f);
        weather.setData(weatherData1);

        weather.removeObserver(sina);
        weather.setData(weatherData1);
    }
}
