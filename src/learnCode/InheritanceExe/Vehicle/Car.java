package learnCode.InheritanceExe.Vehicle;

public class Car extends Vehicle {
    private int Seats;
    public Car(String model, String FuelType, int Year, float FuelEfficiency) {
        super(model, FuelType, Year, FuelEfficiency);
    }
    public int getSeats(){
        return Seats;
    }

    @Override
    public float calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0f/ (1.0f+ (getSeats()/5.0f)));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency()*getFuelEfficiency();
    }

    @Override
    public float getMaxSpeed() {
        return 180.0f;
    }
}
