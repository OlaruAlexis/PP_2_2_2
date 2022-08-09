package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMV", "Black", 500));
        cars.add(new Car("Reno", "White", 400));
        cars.add(new Car("Lada", "Blue", 600));
        cars.add(new Car("AUDI", "Orange", 500));
        cars.add(new Car("BMV", "Red", 800));

    }

    @Override
    public List<Car> showAllCars() {
        return cars;
    }

    @Override
    public List<Car> showSomeCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
