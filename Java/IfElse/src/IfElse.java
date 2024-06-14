public class IfElse {
    public static void main(String[] args) {

        int age = 18;

        if(age >= 18){
            System.out.println("legal drinking age");
        } else {
            System.out.println("illegal drinking age");
        }

        //(condition)?condition. : condition.
        System.out.println((age >= 18)? "legal drinking age" : "illegal drinking age");
    }
}
