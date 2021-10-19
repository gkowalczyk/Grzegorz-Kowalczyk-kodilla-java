package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
         Map<String, Double> resultMap = new HashMap<>();

         for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
           resultMap.put(temperature.getKey(), temperature.getValue() + 1);
    }
    return resultMap;
    }
    public double getAverage() {
        double sum = 0;
        for (double valuesT : calculateForecast().values()) {
            sum = sum + valuesT;
        }
            return sum/calculateForecast().size();
    }
    public  double getMedian() {
    Collection<Double> valuesMap = calculateForecast().values();
    List<Double> list = new ArrayList<Double>(valuesMap);
    Collections.sort(list);
   int mid =list.size()/ 2;
    if (list.size() % 2 == 0) {
        return (list.get(mid) + list.get(mid -1)) / 2;
    }
    return list.get(mid) ;
    }
}



