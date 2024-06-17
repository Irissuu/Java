//import the JOptionPane library

public class CastWrapper {
    public static void main(String[] args) {
        //cast
        double num1 = 5.5;
        double num2 = 5.16;

        //convert to integer
        int calc = (int )((int )num1 + num2);
        System.out.println("Cast: " + calc);

        //wrapper
        String num3 = "123";
        int conversion = Integer.parseInt(num3);

        int calc1 = conversion + 7;
        System.out.println("Wrapper: " + calc1);
    }
}
