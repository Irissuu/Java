package ConstantsVariables;

public class ConstantsVariables {
    public static void main(String[] args) {

        // variable (variable can have its value changed)
        int number = 10;
        System.out.println("Number is currently: " + number);

        number = 12;
        System.out.println("Number is currently: " + number);

        // constant (does not change the value, a solid value)
        final String name = "Iris";
        System.out.println("My name is: " + name);

        // name = "Irisu";
        // java: cannot assign a value to final variable nome
    }
}
