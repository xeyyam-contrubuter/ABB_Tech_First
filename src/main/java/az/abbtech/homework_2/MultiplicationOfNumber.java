package az.abbtech.homework_2;

import java.util.Scanner;

public class MultiplicationOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner enternumber = new Scanner(System.in);
        int a = enternumber.nextInt();
        int factorial = 1;
        int i = 1;
        for (; i <= a; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}

