package Abstract;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String VinNumber, String make, String model, int mileage) {
        super(VinNumber, make, model, mileage);
    }

    @Override
    public String getInfo() {
        return "";
    }
}
