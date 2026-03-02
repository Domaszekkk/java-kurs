import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("toyota", "corolla", 2020, FuelType.PETROL, 50, 5, 7.0);
        Motorcycle moto = new Motorcycle("yamaha", "R1", 2022, FuelType.PETROL, 20, 5.5);
        Car car2 = new Car("tesla", "model s", 2022, FuelType.ELECTRIC, 78, 5, 13.1);
        List<Drivable> vehicles = new ArrayList<>(List.of(car2, car, moto));
        List<Vehicle> vehicles1 = new ArrayList<>(List.of(car2, car, moto));

        for (Vehicle c : vehicles1) {
            c.displayInfo();
        }

        for (Drivable v : vehicles) {
            v.drive(100);
        }

//        car.displayInfo();
//        car.refuel(60);
//        ((Drivable) car).drive(100);
//
//        System.out.println();
//
//        moto.displayInfo();
//        moto.refuel(5);
//        ((Drivable) moto).drive(100);
//
//        System.out.println();
//
//        car2.displayInfo();
//        car2.refuel(50);
//        ((Drivable)car2).drive(400);
    }
}