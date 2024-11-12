package az.abbtech.homework_2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner enternumber = new Scanner(System.in);
        int num = enternumber.nextInt();

        System.out.println("Prime numbers up to " + num + ":");

        for (int n = 2; n <= num; n++) {
            boolean checker = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    checker = false;
                    break;
                }
            }

            if (checker) {
                System.out.print(n + " ");
            }
        }
    }
}
