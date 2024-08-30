package learnCode.InheritanceExe.Vehicle;

public class Truck extends Vehicle{
    private int capacity;
    public Truck(String model, String FuelType, int Year, float FuelEfficiency) {
        super(model, FuelType, Year, FuelEfficiency);
    }
    public int getCapacity(){
        return capacity;
    }
    @Override
    public float calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0f / (1.0f + (getCapacity())/1000.0f));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency()*getFuelEfficiency();
    }

    @Override
    public float getMaxSpeed() {
        return 100.0f;
    }
}
