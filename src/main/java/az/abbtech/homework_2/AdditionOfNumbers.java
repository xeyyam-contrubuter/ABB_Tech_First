package az.abbtech.homework_2;

import java.util.Scanner;

public class AdditionOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner enternumber = new Scanner(System.in);
        int a = enternumber.nextInt();
        int total = 0;
        int i = 0;
        for (; i <= a; i++) {
            total += i;

        }
        System.out.println(total);
    }
}
