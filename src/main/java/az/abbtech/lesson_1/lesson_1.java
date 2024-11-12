package az.abbtech.lesson_1;

public class lesson_1 {
    int age = 20;
    Integer agew = (Integer) 20;
    public static void main(String[] args) {
        int age = 20;
        Integer agew = (Integer) 20;
        byte agebyte = (byte) 200;
        int agecast = agebyte;
        int basenarrow = 500;
        byte revbasenarrow = (byte) basenarrow;

        System.out.println(age);
        System.out.println("Hello World");
        System.out.println(agew);
        System.out.println(agebyte);
        System.out.println(agecast);
        System.out.println(revbasenarrow);
    }
}
