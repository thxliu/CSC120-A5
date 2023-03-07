public class Passenger {
    
    /**
     * private attribute of type String for the passenger's name
     */
    private String name;

    /**
     * public constructor that creates a passenger that sets a value for their name
     * @param name the passenger's name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * public method tells the passenger to board a given car using the addPassenger method. if the car is full, an exception is thrown
     * @param c the given car
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    /**
     * public method that calls the passenger to get off a given car using removePassenger(). 
     * if the passenger wasn't onboard, an exception is thrown.
     * @param c the given car
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * getter for private attribute name
     * @return name for this passenger
     */
    public String getName(){
        return this.name;
    }

}
