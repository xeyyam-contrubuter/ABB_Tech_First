package az.abbtech.lesson_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(1, 2));
        System.out.println(Operation.MULTIPLY.apply(10, 2));
        System.out.println(Operation.DIVIDE.apply(8, 2));
        System.out.println(Operation.SUBTRACT.apply(10, 2));
    }
}
