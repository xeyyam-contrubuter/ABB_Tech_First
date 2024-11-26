package az.abbtech.homework_5.task_2;

public class CoffeeOrder {
    private CoffeeType type;
    private CoffeeSize size;

    // Constructor to initialize the coffee type and size
    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    // Method to print order details
    public void printOrderDetails() {
        System.out.println("Coffee Type: " + type);
        System.out.println("Description: " + type.getDescription());
        System.out.println("Size: " + size);
        System.out.println("Price: $" + size.getPrice());
    }

    // Method to calculate the total cost
    public double calculateTotal() {
        return size.getPrice();
    }
}
