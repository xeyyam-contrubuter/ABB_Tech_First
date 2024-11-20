package az.abbtech.homework_4.task_1;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        while (true){

            System.out.println("Hello! Please enter the Product Name: ");
            Scanner productName = new Scanner(System.in);
            String pn = productName.nextLine();

            if (pn.equalsIgnoreCase("stop")) {
                break;
            }

            Product product= new Product(pn);

            System.out.println(product);

        }


    }
}
