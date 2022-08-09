package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> showAllCars() {
        return carDAO.showAllCars();
    }

    @Override
    public List<Car> showSomeCar(int count) {
        return carDAO.showSomeCar(count);
    }
}
