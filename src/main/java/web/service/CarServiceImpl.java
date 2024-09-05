package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Honda", "Civic", 2019),
            new Car("Ford", "Focus", 2018),
            new Car("Chevrolet", "Malibu", 2021),
            new Car("BMW", "X5", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
