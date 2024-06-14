import java.util.Scanner;

public class IfChained {
    public static void main(String[] args) {

        /*
        less than 18.5 thinness
        between 18.5 and 24.9 normal
        between 25.0 and 29.9 overweight
        between 30.0 and 39.9 obesity
        greater than 40.0 severe obesity
        * */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your bmi is: " + bmi);

        if (bmi <= 18.5){
            System.out.println("Thinness");
        } else if (bmi >= 18.5 && bmi <=24.9){
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("Overweight");
        } else if (bmi >= 30.0 && bmi <= 39.9){
            System.out.println("Obesity");
        } else {
            System.out.println("Severe obesity");
        }

    }
}