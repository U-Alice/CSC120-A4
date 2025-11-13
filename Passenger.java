/*
 * Passenger class represents a passenger who can board and get off cars.
 */
public class Passenger implements PassengerRequirements {
    // attributes
    private String name;

    /**
     * Constructor for Passenger class
     * 
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    // accessors and manipulators
    public String getName() {
        return name;
    }

    /**
     * Boards a passenger onto a specified car if there is an available seat.
     * 
     * @param c Car object to board the passenger onto.
     */
    public void boardCar(Car c) {
        boolean carBoarding = c.addPassenger(this);
        if (carBoarding) {
            System.out.println("Passenger boarded on car successfully!!");
        } else {
            System.out.println("Ooops! Boarding not successfull, car may be full or passenger arleady boarded!");
        }
    }

    /**
     * Removes a passenger from a specified car if they are present.
     * 
     * @param c Car object to remove the passenger from.
     */
    public void getOffCar(Car c) {
        boolean unBoardingCar = c.removePassenger(this);
        if (unBoardingCar) {
            System.out.println("Passenger offboarding successful!");
        } else {
            System.out.println("Passenger offboarding failed! Passenger not found in car!");
        }
    }
}
