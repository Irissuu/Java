import javax.swing.*;

public class JoptionpaneWrapper {
    public static void main(String[] args) {

        //Example wrapper: String str = "123";
        //int num = Integer.parseInt(str); // Convert the string to an int using Integer.parseInt()
       //System.out.println("Number: " + num); // Output: Number: 123

        // it displays a message box for you and you can type in it
        String wg = JOptionPane.showInputDialog(null, "Type weight");
        String hg = JOptionPane.showInputDialog(null, "Type height");

        double weight = Double.parseDouble(wg); // Converts the string to a double using Double.parseDouble()
        double height = Double.parseDouble(hg); // Converts the string to a double using Double.parseDouble()
        double bmi = weight / (height * height);

        if (bmi <= 18.5){
            JOptionPane.showMessageDialog(null, "Thinness");
        } else if (bmi >= 18.5 && bmi <=24.9){
            JOptionPane.showMessageDialog(null, "Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9){
            JOptionPane.showMessageDialog(null, "Overweight");
        } else if (bmi >= 30.0 && bmi <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesity");
        } else {
            JOptionPane.showMessageDialog(null, "Severe obesity");
        }

    }
}
