package oopWithNLayered;

import oopWithNLayered.business.abstracts.CarService;
import oopWithNLayered.business.concretes.CarManager;
import oopWithNLayered.dataAccess.concretes.HibernateCarDao;
import oopWithNLayered.entities.concretes.Car;

public class Main {
    public static void main(String[] args) {
        //ToDo: Spring IoC ile iyileştirilecek
        CarService carService = new CarManager(new HibernateCarDao()); // CarManager'ı oluştur ve HibernateCarDao örneğini ileterek

        Car car = new Car(1, 2 , "Mercedes", 120000);
        Car car2 = new Car(2, 3, "Nissan", 2000000);
        Car car3 = new Car(3, 3, "Nissan", 2000000);
        Car car4 = new Car(4, 3, "Nissan", 2000000);
        Car car5 = new Car(5, 3, "Nissan", 2000000);
        Car car6 = new Car(6, 3, "Nissan", 2000000);

        carService.add(car);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);
        carService.add(car5);
        carService.add(car6);
    }


}
