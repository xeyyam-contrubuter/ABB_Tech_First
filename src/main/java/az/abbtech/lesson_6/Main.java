package az.abbtech.lesson_6;

public class Main implements AnonymousInterface {
    public static void main(String[] args) {

        AppleCorpEncapsulation obj = new AppleCorpEncapsulation();
        obj.setColor("Silver");
        obj.setCpuType("M3");
        obj.setPrice(6000);
        obj.setModel("MacBook Pro");
        System.out.println(obj.getColor());
        System.out.println(obj.getCpuType());
        System.out.println(obj.getPrice());
        System.out.println(obj.getModel());

        AnonymousInterface welcomeToTeam = new AnonymousInterface(){

            @Override
            public void hello() {
                System.out.println("Welcome to team");
            }
        };

        welcomeToTeam.hello();

        InnerClass newinner = new InnerClass();
        InnerClass.memberInnerClass newmember = newinner.new memberInnerClass();
        newmember.isAlive = true;











    }


    @Override
    public void hello() {
        System.out.println("Welcome to board");
    }
}
