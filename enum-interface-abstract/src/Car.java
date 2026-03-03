public class Car extends Vehicle implements Drivable {
    private final int doors;
    private final double fuelConsumption;

    public Car(String brand, String model, int year, FuelType fuelType, double tankCapacity, int doors, double fuelConsumption) {
        super(brand, model, year, fuelType, tankCapacity);
        this.doors = doors;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void drive(long distance) {
        if (fuelLevel >= (distance * fuelConsumption) / 100.0) {
            fuelLevel -= (distance * fuelConsumption) / 100.0;
            System.out.printf("samochód przejechał %d km%n", distance);
        } else {
            System.out.println("zbyt mało paliwa");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Auto: %s %s  paliwo: %.2f/%.2f  drzwi: %d", brand, model, fuelLevel, tankCapacity, doors);
    }
}