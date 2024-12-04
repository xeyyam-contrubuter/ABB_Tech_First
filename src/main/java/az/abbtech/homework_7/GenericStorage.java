package az.abbtech.homework_7;

import java.util.ArrayList;
import java.util.List;

class GenericStorage<T extends AllUsers> {
    private List<T> items;
    private static int counter = 1;

    public GenericStorage() {
        items = new ArrayList<>();
    }

    public void addItem(String name, int age) {
        T newItem = createItem(counter++, name, age);
        items.add(newItem);
        System.out.println(newItem.getClass().getSimpleName() + " added: " + newItem);
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
        System.out.println("Item with ID " + id + " removed.");
    }

    public T searchItem(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            System.out.println("Items in storage:");
            for (T item : items) {
                System.out.println(item);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private T createItem(int id, String name, int age) {
        try {
            if (this.items.isEmpty() || this.items.get(0) instanceof Student) {
                return (T) new Student(id, name, age);
            } else {
                return (T) new Teacher(id, name, age);
            }
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Invalid type");
        }
    }
}