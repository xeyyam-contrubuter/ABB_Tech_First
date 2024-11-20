package az.abbtech.lesson_3;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        System.out.println("input start value: ");
        Scanner start = new Scanner(System.in);
        int startInt = start.nextInt();
        System.out.println("input end value: ");
        Scanner end = new Scanner(System.in);
        int endInt = end.nextInt();
        String text = "Hello, World!";
        String subtext = text.substring(startInt, endInt);
        System.out.println("Result: " + subtext);

    }
}
