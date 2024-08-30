package learnCode.InheritanceExe.Vehicle;

public class Bike extends Vehicle {
    private float Engine;
    public Bike(String model, String FuelType, int Year, float FuelEfficiency) {
        super(model, FuelType, Year, FuelEfficiency);
    }

    public float getEngine(){

        return Engine;
    }

    @Override
    public float calculateFuelEfficiency() {

        return getFuelEfficiency()*(1.0f/(1.0f + (getEngine()/1000.0f)));
    }

    @Override
    public float calculateDistanceTraveled() {
        return calculateFuelEfficiency()*getFuelEfficiency();
    }

    @Override
    public float getMaxSpeed() {
        return 150.0f;
    }
}
