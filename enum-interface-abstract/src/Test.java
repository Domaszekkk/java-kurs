public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("toyota", "corolla", 2020, FuelType.PETROL, 50, 5, 7.0);
        Vehicle moto = new Motorcycle("yamaha", "R1", 2022, FuelType.PETROL, 20, 5.5);
        Vehicle car2 = new Car("tesla", "model s", 2022, FuelType.ELECTRIC, 78, 5, 13.1);

        car.displayInfo();
        car.refuel(60);
        ((Drivable) car).drive(100);

        System.out.println();

        moto.displayInfo();
        moto.refuel(5);
        ((Drivable) moto).drive(100);

        System.out.println();

        car2.displayInfo();
        car2.refuel(50);
        ((Drivable)car2).drive(400);
    }
}