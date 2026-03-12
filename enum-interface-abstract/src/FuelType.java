public enum FuelType {
    PETROL(6.30),
    DIESEL(5.89),
    ELECTRIC(1.00);

    private final double pricePerUnit;
    FuelType (double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
