public abstract class Vehicle {
    protected String brand, model;
    protected int year;
    protected FuelType fuelType;
    protected double tankCapacity;
    protected double fuelLevel;

    public Vehicle(String brand, String model, int year, FuelType fuelType, double tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = 0;
    }

    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            System.out.printf("mkaksymalna ilość paliwa przekroczona, dolano do pełna Koszt: %.2f%n",
                    (tankCapacity - fuelLevel) * fuelType.getPricePerUnit());
            fuelLevel = tankCapacity;
        } else {
            fuelLevel += amount;
            System.out.printf("zatankowano: %.2f. koszt: %.2f%n", amount, amount * fuelType.getPricePerUnit());
        }
    }

    public abstract void displayInfo();

    @Override
    public abstract String toString();
}