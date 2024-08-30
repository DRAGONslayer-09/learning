package learnCode.InheritanceExe.Vehicle;

public abstract class Vehicle {
    private String model, FuelType;
    private int Year;
    private float FuelEfficiency;
    public Vehicle(String model, String FuelType, int Year, float FuelEfficiency){
        this.model = model;
        this.FuelType = FuelType;
        this.Year = Year;
        this.FuelEfficiency = FuelEfficiency;
        }

    public Vehicle() {
    }

    public String getModel(){
        return model;
    }
    public String getFuelType(){
        return FuelType;
    }
    public int getYear(){
        return Year;
    }
    public float getFuelEfficiency(){
        return FuelEfficiency;
    }
    public abstract float calculateFuelEfficiency();
    public abstract float calculateDistanceTraveled();
    public abstract float getMaxSpeed();
}
