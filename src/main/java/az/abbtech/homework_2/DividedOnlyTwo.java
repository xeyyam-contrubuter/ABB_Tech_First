package az.abbtech.homework_2;

import java.util.Scanner;

public class DividedOnlyTwo {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner enternumber = new Scanner(System.in);
        int a = enternumber.nextInt();
        int i;
        for (i = 0; i < a; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

            }

        }
    }
}
