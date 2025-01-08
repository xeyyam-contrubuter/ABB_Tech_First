package az.abbtech.lesson_3;

public class Car {
    private String model;
    private int velocity;
    private String color;

    public Car(String model, int velocity, String color) {
        this.model = model;
        this.velocity = velocity;
        this.color = color;
    }

    public Car(String model, int velocity) {
        this.model = model;
        this.velocity = velocity;

    }

    public Car(String model) {
        this.model = model;
    }

    {
        System.out.println("Default initialization Block");
    }
    static {
        System.out.println("Static initialization Block");
    }

}
