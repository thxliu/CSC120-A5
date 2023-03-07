import java.util.ArrayList;

public class Car {

    /**
     * private attribute ArrayList to store the passengers currently onboard
     */
    private ArrayList<Passenger> passengersOnBoard;
    
   
    /**
     * private int for the car's maximum passenger capacity
     */
    private int maxCapacity;

    /**
     * public constructor that takes in a value for the car's maximum capacity and initializes the ArrayList
     * @param maxCapacity the car's maximum passenger capacity
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnBoard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * getter for private int maxCapacity()
     * @return maxCapacity()
     */
    public int getCapacity(){
        return maxCapacity;

    }

    /**
     * calculates the remaining seats in the car
     * @return the remaining seats 
     */
    public int seatsRemaining(){
        return this.maxCapacity - passengersOnBoard.size();
        
    }

    /**
     * public method to add a passenger and confirm the passenger is on board after checking there are seats remaining in the car.
     * if there are no more seats left, an exception is thrown.
     * @param p the passenger 
     */
    public void addPassenger(Passenger p){
        if (seatsRemaining() > 0){
            if (this.passengersOnBoard.contains(p)) { //Already on board
                throw new RuntimeException(p.getName() + " is already on board the car.");
            }
            else {
                passengersOnBoard.add(p);
                System.out.println(p.getName() + " has been added to the car.");
            }
        }
        else {
            System.out.println("There are " + seatsRemaining() + " seats left.");
        }
    }

    /**
     * public method to remove a passenger and confirm the passenger is off board after checking that the passenger was already on board. 
     * if the passenger was not on board, an exception is thrown.
     * @param p the passenger
     */
    public void removePassenger(Passenger p) {
        if (this.passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p);
            System.out.println(p.getName() + " has been removed from the car.");
        }
        else {
            throw new RuntimeException(p.getName() + " is not on board the car - cannot remove.");
        }
    }

    /**
     * public method to print a list of all the passengers aboard the car. 
     * if there are no passengers, an exception is thrown.
     */
    public void printManifest() {
        if (this.passengersOnBoard.size() > 0) {
            for (int i = 0; i < passengersOnBoard.size(); i++) {
                System.out.println(passengersOnBoard.get(i).getName());
            }
        }
        else {
            throw new RuntimeException("This car is EMPTY.");
        }

    }


}