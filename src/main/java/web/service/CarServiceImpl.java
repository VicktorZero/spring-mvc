package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

   private final CarDao carDao;

   public CarServiceImpl(CarDao carDao){
       this.carDao = carDao;
   }


    @Override
    public List<Car> showCars(int count) {
        return carDao.showCars(count);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
