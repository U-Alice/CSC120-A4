/**
 * Engine class represents the engine of a train, managing its fuel type and levels.
 */
public class Engine implements EngineRequirements {

    // attributes
    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    // accessors and manipulators

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public double getMaxFuel() {
        return this.maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentLevel) {
        this.currentFuel = currentLevel;
    }

    /**
     * Constructor for Engine class
     * 
     * @param fuelType    type of fuel the engine uses
     * @param maxFuel     maximum fuel capacity of the engine
     * @param currentFuel current fuel level of the engine
     */
    public Engine(FuelType fuelType, double maxFuel, double currentFuel) {
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
        this.fuelType = fuelType;
    }

    /**
     * Refuels the engine to its maximum fuel capacity.
     * @return void
     */
    public void refuel() {
        this.currentFuel = maxFuel;
    }

    /**
     * Simulates the engine going. Decreases fuel level by 1.0 unit each time it is
     * called.
     * 
     * @return true if the engine can go (has fuel), false if it is out of fuel
     */
    public Boolean go() {
        System.out.println("Choo choo!");
        if (currentFuel > 0) {
            // use some fuel each time the engine goes
            currentFuel -= 1.0;
            System.out.println("Engine running... Remaining fuel: " + currentFuel);
            return true;
        } else {
            System.out.println("No fuel left. The engine has stopped.");
            return false;
        }
    }

}