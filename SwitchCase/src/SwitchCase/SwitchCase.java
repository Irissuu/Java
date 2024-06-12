package SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {

        String drinkWater = "maybe";

        switch (drinkWater){
            // in case "yes" return "water in glass"
            case "yes":
                System.out.println("water in glass");
                // break is used to signal that the block of code has finished
                break;

            // in case "maybe" return "drink water"
            case "maybe":
                System.out.println("drink water");
                break;

            // if none of the cases return "have you had water today?"
            default:
                System.out.println("have you had water today?");
        }
    }
}
