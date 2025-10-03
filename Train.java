import java.util.ArrayList;

/**
 * Train class represents a train composed of an engine and multiple cars,
 * managing overall passenger capacity and manifest.
 */
public class Train implements TrainRequirements {
    // attributes
    private Engine engine;
    private ArrayList<Car> cars;
    private int seatsRemaining;
    private int maxCapacity;

    /**
     * Constructor for Train class
     * 
     * @param fuelType          type of fuel the engine uses
     * @param currentFuelLevel  current fuel level of the engine
     * @param fuelCapacity      maximum fuel capacity of the engine
     * @param nCars             number of cars in the train
     * @param passengerCapacity total passenger capacity across all cars
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, currentFuelLevel);
        cars = new ArrayList<>(nCars);
        int capacityPerCar = passengerCapacity / nCars;
        for (int i = 0; i < nCars; i++) {
            Car newCar = new Car(capacityPerCar);
            cars.add(newCar);
        }
    }

    // accessors and manipulators
    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Calculates and returns the maximum passenger capacity of the train by summing
     * the capacities of all individual cars.
     * 
     * @return total maximum passenger capacity of the train
     */
    public int getMaxCapacity() {
        for (Car car : cars) {
            this.maxCapacity += car.getCapacity();
        }
        return this.maxCapacity;
    }

    /**
     * Calculates and returns the total number of seats remaining across all cars in
     * the train.
     * 
     * @return total number of seats remaining
     */
    public int seatsRemaining() {
        this.seatsRemaining = 0;
        for (Car car : cars) {
            this.seatsRemaining += car.seatsRemaining();
        }
        return this.seatsRemaining;
    }

    /**
     * Prints a manifest of all passengers currently aboard the train, organized by
     * car.
     * 
     * @return void
     */
    public void printManifest() {
        System.out.println("******* PASSENGERS ABOARD TRAIN ******");
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println();
            System.out.println("** Car " + (i + 1) + " " + "**");
            cars.get(i).printManifest();
        }
    }
}
