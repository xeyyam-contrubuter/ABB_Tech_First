package az.abbtech.homework_2;

import java.util.Scanner;

public class FindCountNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner enternumber = new Scanner(System.in);
        int a = enternumber.nextInt();
        int counter = 0;
        while (a != 0) {
            a = a / 10;
            counter++;
        }
        System.out.println(counter);

    }
}
