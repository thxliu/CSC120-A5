import java.util.ArrayList;

public class Train {

    /**
     * private attribute engine marked with keyword 'final' to establish a composition relationship
     */
    private final Engine engine;

    /**
     * private ArrayList to store the currently attached cars
     */
    private ArrayList<Car> cars;
    
    // a constructor `public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)` which will initialize the `Engine` and `Car`s and store them
    /**
     * public constructor that initializes the 'Engine' and 'Car' and stores them
     * @param fuelType fuel type of the engine 
     * @param fuelCapacity maximum fuel capacity for a given engine 
     * @param nCars number of cars attached to the train
     * @param passengerCapacity maximum passenger capacity for a given car 
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            this.cars.add(car);
        }
    }

    /**
     * getter for private attribute engine
     * @return the engine 
     */
    public Engine getEngine(){
        return this.engine;

    }

    /**
     * gives the car corresponding to index i
     * @param i index within the array
     * @return the car located at index i within the array
     */
    public Car getCar(int i){
        return this.cars.get(i);

    }

    /**
     * calculates the the sum of the maximum capacity of each of the cars
     * @return the maximum total capacity across all cars
     */
    public int getMaxCapacity(){
        int totalMaxCapacity = 0;

        for (int i = 0; i < cars.size(); i++){
            totalMaxCapacity += cars.get(i).getCapacity();
        }
        return totalMaxCapacity;
    }

    /**
     * calculates the sum of the remaining open seats in each of the cars
     * @return the total remaining open seats across all cars
     */
    public int seatsRemaining(){
        int totalSeatsRemaining = 0;

        for (int i = 0; i < cars.size(); i++){
            totalSeatsRemaining += cars.get(i).seatsRemaining();
        }
        return totalSeatsRemaining;
    }

    /**
     * prints a roster of all passengers onboard across all cars
     */
    public void printManifest(){
        for (int i = 0; i < cars.size(); i++){
            cars.get(i).printManifest();
        }   
    }

}
