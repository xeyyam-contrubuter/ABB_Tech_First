package az.abbtech.homework_5.task_2;

public enum CoffeeSize {
    SMALL(2.5),
    MEDIUM(3.5),
    LARGE(4.5);

    private final double price;

    // Constructor
    CoffeeSize(double price) {
        this.price = price;
    }

    // Method to get the price
    public double getPrice() {
        return price;
    }


}
