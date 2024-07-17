import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConstructorMethod test = new ConstructorMethod();
        System.out.println(test.number);

        System.out.println("Type a number: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        ConstructorMethod num1 = new ConstructorMethod(n1);
        System.out.println(num1.number);
    }
}
