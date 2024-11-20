package az.abbtech.lesson_3;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        System.out.println("input replace value: ");
        Scanner replaced = new Scanner(System.in);
        String input = replaced.nextLine();
        System.out.println("input current value: ");
        Scanner currented = new Scanner(System.in);
        String current = currented.nextLine();
        String text = "banana";
        String replacedText = text.replace(current, input);
        System.out.println("Result: " + replacedText);
    }
}
