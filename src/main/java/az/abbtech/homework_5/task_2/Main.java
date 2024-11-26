package az.abbtech.homework_5.task_2;

public class Main {
    public static void main(String[] args) {
        // Create Coffee Orders
        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.ESPRESSO, CoffeeSize.SMALL);
        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.LATTE, CoffeeSize.MEDIUM);
        CoffeeOrder order3 = new CoffeeOrder(CoffeeType.CAPPUCCINO, CoffeeSize.LARGE);

        // Display Order Details and Total Price
        System.out.println("Order 1 Details:");
        order1.printOrderDetails();
        System.out.println("Total: $" + order1.calculateTotal());
        System.out.println();

        System.out.println("Order 2 Details:");
        order2.printOrderDetails();
        System.out.println("Total: $" + order2.calculateTotal());
        System.out.println();

        System.out.println("Order 3 Details:");
        order3.printOrderDetails();
        System.out.println("Total: $" + order3.calculateTotal());
    }
}
