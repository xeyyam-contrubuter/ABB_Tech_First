package az.abbtech.homework_5.task_2;

public enum CoffeeType {
    ESPRESSO("A strong coffee shot."),
    LATTE("A smooth coffee with milk."),
    CAPPUCCINO("A rich and foamy coffee.");

    private final String description;

    // Constructor
    CoffeeType(String description) {
        this.description = description;
    }

    // Method to get the description
    public String getDescription() {
        return description;
    }
}
