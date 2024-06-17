import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog(null, "Enter a number: ");
        double num1 = Double.parseDouble(num);
        // to calculate xy, you write Math. pow(x, y), where x and y are of type double, and so is the result
        // calculate the value of a number raised to a power
        double potency = Math.pow(num1, 2);
        // the Math.pow() function can be used to calculate the square power of a number
        double root = Math.sqrt(potency);
        System.out.println("Result: " + potency);
        System.out.println("Squared: " + root);
    }
}
