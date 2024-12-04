package az.abbtech.lesson_7;

public class GenericBox<T> {
    private T[] value;

    public GenericBox(T [] value) {
        this.value = value;

    }

    void genericMethod() {
        for (T value : value) {
            System.out.println(value);
        }

    }
}
