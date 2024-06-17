import javax.swing.*;

public class CalculatorInt {
    public static void main(String[] args) {


        int numfix[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String num1 = JOptionPane.showInputDialog(null, "Enter a number: ");
        // wrapper
        double num2 = Double.parseDouble(num1);

        for (int cont = 0; cont <9; cont++){
            int sum = (int)((int)numfix[cont] + num2);
            int sub = (int)((int)numfix[cont] - num2);
            int multi = (int)((int)numfix[cont] * num2);
            int div = (int)((int)numfix[cont] / num2);

            System.out.println(sum + " " + sub + " " + multi + " " + div);
        }
    }
}
