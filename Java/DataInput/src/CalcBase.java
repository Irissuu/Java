import java.util.Scanner;

public class CalcBase {
    public static void main(String[] args) {

        // maps the keyboard keys I'm typing
        Scanner input = new Scanner(System.in);

        System.out.println("number 1: ");
        int n1 = input.nextInt();
        System.out.println("number 2: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;
        int sub = n1 - n2;
        int multi = n1 * n2;
        int div = n1 / n2;

        System.out.println("sum: " + sum);
        System.out.println("subtraction: " + sub);
        System.out.println("multiplication: " + multi);
        System.out.println("division: " + div);

    }
}
