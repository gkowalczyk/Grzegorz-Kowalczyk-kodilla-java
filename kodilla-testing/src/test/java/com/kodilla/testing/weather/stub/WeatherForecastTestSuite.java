package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test

    void testCalculateForecastTestSuite() {
        //Given
Temperatures temperatures1 = new TemperaturesStub();
WeatherForecast weatherForecast = new WeatherForecast(temperatures1);
//When
int quantityOfSensors = weatherForecast.calculateForecast().size();
//Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
