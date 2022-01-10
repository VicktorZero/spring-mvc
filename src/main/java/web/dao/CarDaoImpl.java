package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("BMV",3));
        carList.add(new Car("Lada",7));
        carList.add(new Car("Porshe", 5));
        carList.add(new Car("Lexus", 1));
        carList.add(new Car("Toyta", 2));

    }

    @Override
    public List<Car> showCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> listCars() {
        return carList;
    }
}
