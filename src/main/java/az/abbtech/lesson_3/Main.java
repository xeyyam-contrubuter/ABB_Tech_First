package az.abbtech.lesson_3;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String ins1 = "Salam";
        String ins2 = "Salam";
        System.out.println(ins1 == ins2);
        String ins3 = "Salam";
        String ins4 = new String("Salam");
        System.out.println(ins3 == ins4);
        System.out.println(ins3.equals(ins4));
        String ins5 = String.valueOf("Salam");
        System.out.println(ins5 == ins3);
        System.out.println(ins5.length());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Salam").append("Salam").append("Salam");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Salam").append("Salam").append("Salam");
        System.out.println(stringBuffer.toString());


        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("Salam").add("Salam").add("Salam");
        System.out.println(stringJoiner);

        Car car = new Car("Ford", 180, "White" );
        Car car2 = new Car("Ford", 180 );
        Car car3 = new Car("Ford" );
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
    }
}
