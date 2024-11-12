package az.abbtech.lesson_2;

import java.util.Scanner;

public class boxing {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

//        int posta = 5;
//        int postb = 3;
//        int prea = 10;
//        int preb = 4;
//        System.out.println(posta++ + postb);
//        System.out.println(++posta + postb);
//        System.out.println(prea-- - preb);
//        System.out.println(--prea - preb);
//        boolean and1 = true;
//        boolean and2 = false;
//        boolean or1 = false;
//        boolean or2 = true;
//        System.out.println(and1 && and2); //and
//        System.out.println(or1 || or2);   //true

        int x = 0;
        int y = 0;

        for (; y < 70 && x < 50; x++, y+=2){
            System.out.println("x= " + x);
            System.out.println("y= " + y);
        }


    }
}
