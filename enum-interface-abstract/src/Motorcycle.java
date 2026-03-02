public class Motorcycle extends Vehicle implements Drivable {
    private double fuelConsumption;

    public Motorcycle(String brand, String model, int year, FuelType fuelType, double tankCapacity, double fuelConsumption) {
        super(brand, model, year, fuelType, tankCapacity);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void drive(long distance) {
        if (fuelLevel >= (distance * fuelConsumption) / 100.0) {
            fuelLevel -= (distance * fuelConsumption) / 100.0;
            System.out.printf("Motocykl przejechał %d km%n", distance);
        } else {
            System.out.println("Brak paliwa");
        }
    }

    @Override
    public String toString() {
        return String.format("Moto: %s %s , Paliwo: %.2f/%.2f", brand, model, fuelLevel, tankCapacity);
    }
}