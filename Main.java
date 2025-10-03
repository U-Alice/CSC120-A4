
class Main {
    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 10.00, 10.00, 3, 15);
        System.out.println("=== Train Created ===");
        System.out.println("Total max capacity: " + train.getMaxCapacity());
        System.out.println("Total seats remaining: " + train.seatsRemaining());
        System.out.println();

        Passenger passenger1 = new Passenger("Diane");
        Passenger passenger2 = new Passenger("Alice");
        Passenger passenger3 = new Passenger("Bob");
        Passenger passenger4 = new Passenger("Claire");

        System.out.println("=== Boarding Passengers ===");
        passenger1.boardCar(train.getCar(0));
        passenger2.boardCar(train.getCar(0));
        passenger3.boardCar(train.getCar(1));
        passenger4.boardCar(train.getCar(1));

        System.out.println("\n=== Train Manifest ===");
        train.printManifest();

        // Check remaining seats
        System.out.println("\nTotal seats remaining: " + train.seatsRemaining());

        // Remove a passenger and check updates
        System.out.println("\n=== Passenger Getting Off ===");
        passenger2.getOffCar(train.getCar(0));
        System.out.println("Seats remaining: " + train.seatsRemaining());

        // Test Engine functionality
        Engine engine = train.getEngine();
        while (engine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        engine.refuel();
        System.out.println("Engine refueled. Current fuel: " + engine.getCurrentFuel());
    }
}
