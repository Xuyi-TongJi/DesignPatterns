package edu.seu.observer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;
}
