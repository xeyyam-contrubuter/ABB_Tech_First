package az.abbtech.homework_11;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an age (1 to 120): ");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Valid age entered: " + age);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static void validateAge(int age) throws InvalidInputException {
        if (age < 1 || age > 120) {
            throw new InvalidInputException("Age must be between 1 and 120.");
        }
    }
}

