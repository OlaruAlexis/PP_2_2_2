package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> showAllCars();

    public List<Car> showSomeCar(int count);

}
