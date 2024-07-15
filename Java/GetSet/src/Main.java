import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String vegetable;
        GetSet veg = new GetSet();
        Scanner input = new Scanner(System.in);

        System.out.println("Type your favorite vegetable");
        vegetable = input.nextLine();

        veg.setVegetable(vegetable);
        veg.showVegetable();
    }
}
