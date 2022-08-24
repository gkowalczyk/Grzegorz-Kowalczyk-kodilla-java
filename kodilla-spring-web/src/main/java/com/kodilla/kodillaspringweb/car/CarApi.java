package com.kodilla.kodillaspringweb.car;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    //@Autowired
    private CarManager carManager;

    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }
//@Autowired
    //  public void setCarManager(CarManager carManager) {
    //  this.carManager = carManager;
    //}

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carManager.getCarList();

    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car) {
        return carManager.addCar(car);
    }

    @GetMapping("/say")
    public String main(@RequestParam String name) {
        return "Hello" + name;
    }
    @ResponseBody//@ResponseBody – wskazówka dla kontekstu Spring, aby zawartość metody (w tym przypadku String) był zwracany nie do modelu dla widoku lecz jako obiekt.
    @RequestMapping//@RequestMapping – adnotacja wskazującą, że dana metoda stanowi Endpoint. Może być wywoływana zdalnie. Przyjmuje ona wartość stanowiącą relatywną ścieżkę dla jej wywołania;
    public String purchase() {
        return "example";
    }
}