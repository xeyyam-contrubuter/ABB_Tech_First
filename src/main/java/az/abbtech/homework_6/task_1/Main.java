package az.abbtech.homework_6.task_1;

public class Main {
    public static void main(String[] args) {
        // Anonymous class extending Animal
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("The animal makes a sound");
            }
        };
        animal.makeSound();
    }
}
