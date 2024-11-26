package az.abbtech.homework_5.task_1;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    abstract void startEngine();
    abstract void move();



}
