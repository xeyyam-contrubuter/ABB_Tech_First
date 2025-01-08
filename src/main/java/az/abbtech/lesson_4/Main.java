package az.abbtech.lesson_4;

public class Main {
    public static void main(String[] args) {
        String name = "Renat";
        int age = 50;
        double salary = 400.00;
        Mutable mutable = new Mutable();

        mutable.doFirstWork(name, age, salary);

        System.out.println(String.format("Out methot printed: name = %s, age = %s, salary = %s, name, age, salary"));

    }
}
