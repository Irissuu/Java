import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // list enum values
    for(Planets p: Planets.values()){
        // %s%n = string value, 1 per line
        System.out.printf("%s%n", p);
    }

    Scanner input = new Scanner(System.in);
    String planet;
        System.out.println("Which planet will we travel to?");
        planet = input.next().toUpperCase();
        input.close();

        Test planet1 = new Test(planet);
        planet1.travelPlanet();
    }
}
