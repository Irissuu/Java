import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Overload fix = new Overload(10, 30);
        System.out.println(fix.n1 + " " + fix.n2);

    Overload calc = new Overload();
    Scanner input = new Scanner(System.in);
    System.out.println("type 2 numbers to be added");
    calc.num1 = input.nextDouble();
    calc.num2 = input.nextDouble();
    System.out.println(calc.operation(fix.num1, fix.num2));
    }
}
