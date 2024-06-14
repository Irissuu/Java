package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {

        //sum, subtraction, division, multiplication
        int n1 = 10;
        int n2 = 3;

        int sum = n1 + n2;
        int sub = n1 - n2;
        int multi = n1 * n2;
        int div = n1 / n2;
        float div2 = (float) n1 / n2;
        double n3 = 11 % 2;


        System.out.println("sum: " + sum);
        System.out.println("subtraction: " + sub);
        System.out.println("multiplication" + multi);
        System.out.println("division: " + div);
        System.out.println("division: " + div2);
        System.out.println("division: " + n3);
    }
}
