package az.abbtech.homework_5.task_1;

public class Bicycle extends Vehicle {

    public Bicycle(String brand, int year) {
        super(brand, year);
    };
    @Override
    void startEngine() {
        System.out.println("Bicycles don't have engines!");

    };

    @Override
    void move(){
        System.out.println("The bicycle pedals along the path.");
    };
}
