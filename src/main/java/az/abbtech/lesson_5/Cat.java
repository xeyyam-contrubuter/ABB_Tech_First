package az.abbtech.lesson_5;

public class Cat implements A,B {
    public static void main(String[] args) {

        A catA = new Cat();
        B catB = new Cat();

        System.out.println(catA);
        System.out.println(catB);
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
        B.super.sayHello();
    }
}
