package com.kodilla.kodillaspringweb.car;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("singleton")
public class CarManager {


    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

   // public CarManager() {
      //this.carList = new ArrayList<>();
    //   carList.add(new Car("name", "mark", "model"));

   // }
    public boolean addCar(Car car) {
        return carList.add(car);
    }
}
