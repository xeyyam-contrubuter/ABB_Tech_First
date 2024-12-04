package az.abbtech.lesson_7;

public class Main {
    public static void main(String[] args) {
//        Box newBox = new Box("red", 10);
//        Box newBox2 = new Box("red", 10);
//        Box newBox3 = new Box("red", 10);
//        System.out.println(newBox.equals(newBox2));

        Integer[] integerElements = {1,2,3,4,5,6,7,8,9};
        String[] stringElements = {"a","b","c","d","e","f"};

        GenericBox<Integer> integerGenericBox = new GenericBox<>(integerElements);
        GenericBox<String> stringGenericBox = new GenericBox<>(stringElements);
        integerGenericBox.genericMethod();
        stringGenericBox.genericMethod();


    }

}
