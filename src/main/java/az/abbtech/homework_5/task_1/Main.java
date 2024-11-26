package az.abbtech.homework_5.task_1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2020);
        System.out.println("Car Details: Brand - " + car.brand + ", Year - " + car.year);
        car.startEngine();
        car.move();

        Vehicle bicycle = new Bicycle("Giant", 2018);
        System.out.println("Bicycle Details: Brand - " + bicycle.brand + ", Year - " + bicycle.year);
        bicycle.startEngine();
        bicycle.move();
    }
}
