package az.abbtech.homework_6.task_4;

public class Main {
    public static void main(String[] args) {
        // Create instance of the nested class
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.startEngine();
    }
}
