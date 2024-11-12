package az.abbtech.homework_2;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner enternumbera = new Scanner(System.in);
        double aside = enternumbera.nextInt();
        System.out.println("Enter b number: ");
        Scanner enternumberb = new Scanner(System.in);
        double bside = enternumberb.nextInt();
        System.out.println("Enter symbol: ");
        Scanner enternumberc = new Scanner(System.in);
        char cside = enternumberc.next().charAt(0);

        switch (cside){
            case '+':
                System.out.println(aside + bside);
                break;
            case '-':
                System.out.println(aside - bside);
                break;
            case '*':
                System.out.println(aside * bside);
                break;
            case '/':
                System.out.println(aside / bside);
                break;
            case '%':
                System.out.println(aside % bside);
                break;
                default:
        }
    }
}
