package az.abbtech.lesson_6;

public class InnerClass {
    String name;
    int age;
    boolean isAlive;
    private static double weight;
    public InnerClass(){
        this.name = name;

    };
    public void display(){
        System.out.println("Name: " + name);
    }
    public class memberInnerClass{

        String name;
        int age;
        boolean isAlive;
        private static double weight;
        public memberInnerClass(){
            this.name = name;

        };
        public void display(){
            System.out.println("Name: " + name);
        }

    }



}
