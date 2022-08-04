package WeatherMockTrainee;

import java.util.*;
import java.util.stream.Collectors;

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
        for(double values : calculateForecast().values()) {
            sum+= values;
        }
      return sum/calculateForecast().entrySet().stream()
              .count();
    }
    public double getMedian() {
List<Double> doubleList = calculateForecast()
        .values()
        .stream()
        .sorted()
        .collect(Collectors.toList());

return  doubleList.size() % 2 == 0 ? (doubleList.get(doubleList.size() / 2 - 1) + doubleList.get(doubleList.size() / 2 )) / 2 : doubleList.get(doubleList.size() / 2);
    }
}


