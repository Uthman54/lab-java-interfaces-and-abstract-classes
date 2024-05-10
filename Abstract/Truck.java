package Abstract;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String VinNumber, String make, String model, int mileage) {
        super(VinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "";
    }
}
