public class Engine {

    /**
     * private attribute FuelType that indicates what type of fuel is used
     */
    private FuelType f;

    /**
     * double attribute to store current and maximum fuel levels
     */
    double currentFuelLevel;
    double maxFuelLevel;

    /**
     * public constructor Engine that sets a value for the above attributes
     * @param f one of the four preset fuel type options
     * @param fuel float number to represent the initial fuel level where current fuel levels are at the maximum fuel capacity
     */
    public Engine(FuelType f, double fuel) {
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel = fuel;
    }

    /**
     * getter for private attribute FuelType f
     * @return returns the fuel type for this engine
     */
    public FuelType getFuelType(){
        return this.f;
    }

    /**
     * resets the current fuel level for this engine to the maximum fuel level
     */
    public void refuel() {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * if current fuel levels are above 0, the method allows the engine to run, decreases the fuel level, and prints the remaining fuel level
     * if current fuels level is 0, the method throws an exception telling the user to refuel 
     */
    public void go () {
        if (currentFuelLevel > 0.0) {
            this.currentFuelLevel = this.currentFuelLevel - 10.0;
            System.out.println("Remaining fuel level is " + currentFuelLevel);
        }
        else if (currentFuelLevel == 0.0) {
            throw new RuntimeException("Current fuel level is " + this.currentFuelLevel + " - Please refuel to go");
        }
    }

}