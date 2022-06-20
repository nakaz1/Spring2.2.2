package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public class CarServise {
    private List<Car> carList;

    public CarServise(List<Car> carList){
        this.carList = carList;
        Car car1 = new Car("BMW", 42, 1990);
        Car car2 = new Car("LADA", 21, 2000);
        Car car3 = new Car("VOLVO", 11, 2010);
        Car car4 = new Car("FORD", 123, 2001);
        Car car5 = new Car("FVW", 77, 2008);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

    }

    public List<Car> countCars(int i){
        if(i > 0 && i < 5) return carList.subList(0, i);
        return carList;
    }


}
