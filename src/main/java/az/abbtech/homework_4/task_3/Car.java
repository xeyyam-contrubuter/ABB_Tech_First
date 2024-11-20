package az.abbtech.homework_4.task_3;

public class Car {
    // Properties
    private String brand;
    private String model;
    private int yearOfProduction;
    private String fuelType;
    private double speed;

    // Constructor
    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.speed = 0; // Default speed
        System.out.println(brand + " " + model + " " + yearOfProduction + " " + fuelType);
    }

    // Method to increase speed
    public void speed(double increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("The speed has been increased by " + increment + " km/h.");
        } else {
            System.out.println("Please provide a positive value to increase the speed.");
        }
    }

    // Method to decrease speed
    public void slow(double decrement) {
        if (decrement > 0) {
            speed -= decrement;
            if (speed < 0) speed = 0;
            System.out.println("The speed has been decreased by " + decrement + " km/h.");
        } else {
            System.out.println("Please provide a positive value to decrease the speed.");
        }
    }

    // Method to stop the car
    public void stop() {
        speed = 0;
        System.out.println("The car has stopped.");
    }

    public void checkSpeed(double speedLimit) {
        System.out.println("Current speed: " + speed + " km/h.");
        if (speed > speedLimit) {
            System.out.println("Warning: You are exceeding the speed limit of " + speedLimit + " km/h!");
        } else {
            System.out.println("You are within the speed limit.");
        }
    }

}
