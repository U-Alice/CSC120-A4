import java.util.ArrayList;

/**
 * Car class represents a single car in a train, managing its passengers and
 * capacity.
 */
public class Car implements CarRequirements {
    // attributes
    private ArrayList<Passenger> passengers;
    private int capacity;

    /**
     * constructor for Car class
     * 
     * @param capacity maximum number of passengers the car can hold
     */
    public Car(int capacity) {
        this.capacity = capacity;
        passengers = new ArrayList<>(capacity);
    }


    /**
     * accessor for the maximum passenger capacity of the car.
     * @return maximum passenger capacity of the car
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Calculates and returns the number of seats remaining in the car.
     * 
     * @return number of seats remaining
     */
    public int seatsRemaining() {
        return capacity - passengers.size();
    }

    /**
     * Adds a passenger to the car if there is available seating.
     * 
     * @param p Passenger object to be added to the car.
     * @return true if the passenger was added successfully, false otherwise.
     */
    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() != 0 & !passengers.contains(p)) {
            this.passengers.add(p);
            return true;
        }
        return false;
    }

    /**
     * Removes a passenger from the car if they are present.
     * 
     * @param p Passenger object to be removed from the car.
     * @return true if the passenger was removed successfully, false otherwise.
     */
    public Boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            this.passengers.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prints a manifest of all passengers currently aboard the car.
     * If the car is empty, it notifies that the car is empty.
     * 
     * @return void
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is empty!");
        } else {
            for (int i = 0; i < passengers.size(); i++) {
                System.out.println(passengers.get(i).getName());
            }
        }
    }
}