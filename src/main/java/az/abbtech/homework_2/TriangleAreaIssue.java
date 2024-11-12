package az.abbtech.homework_2;

import java.util.Scanner;

public class TriangleAreaIssue {
    public static void main(String[] args) {
        System.out.println("Enter Triangle a side: ");
        Scanner enternumbera = new Scanner(System.in);
        double aside = enternumbera.nextInt();
        System.out.println("Enter Triangle b side: ");
        Scanner enternumberb = new Scanner(System.in);
        double bside = enternumberb.nextInt();
        System.out.println("Enter Triangle c side: ");
        Scanner enternumberc = new Scanner(System.in);
        double cside = enternumberc.nextInt();

        double perimeter = aside + bside + cside;
        System.out.println("Perimeter is: " + perimeter);
        double semiPerimeter = (aside + bside + cside) / 2;
        System.out.println("Semi perimeter is: " + semiPerimeter);
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - aside) * (semiPerimeter - bside)* (semiPerimeter - cside));
        System.out.println("Area is: " + area);
    }
}
