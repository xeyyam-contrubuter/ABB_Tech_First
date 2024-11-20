package az.abbtech.homework_4.task_3;

public class Main {

    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2023, "Petrol");

        // Test the methods
        myCar.speed(50);         // Increase speed
        myCar.checkSpeed(60);    // Check against a speed limit
        myCar.speed(20);         // Increase speed
        myCar.checkSpeed(60);    // Check against a speed limit
        myCar.slow(30);          // Decrease speed
        myCar.checkSpeed(60);    // Check against a speed limit
        myCar.stop();            // Stop the car
        myCar.checkSpeed(60);    // Check against a speed limit
    }

}
