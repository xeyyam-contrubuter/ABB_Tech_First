package az.abbtech.lesson_10;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaMain {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + s2;
        System.out.println(biFunction.apply("Hello ", "World"));

        MyFunctionalInterface<String> myfunc = (s) -> System.out.println(s);
        myfunc.doSomething("Hello");
    }
}
