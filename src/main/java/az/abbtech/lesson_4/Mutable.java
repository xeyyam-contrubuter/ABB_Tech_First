package az.abbtech.lesson_4;

public class Mutable {

    String name = "Khayyam";
    int age = 20;
    double salary = 50;

    public final void doFirstWork(String name, int age, double salary) {



        System.out.println(String.format("In methot printed: namw = %s, age = %d, salary = %.2f", name, age, salary));

    }
}
