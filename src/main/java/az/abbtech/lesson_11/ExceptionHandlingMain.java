package az.abbtech.lesson_11;

import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        try{
            if (number == 10) {
                throw new ArithmeticException("10 NotAllowed");

            }else {
                System.out.println(number);
            }
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
