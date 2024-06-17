public class Main {
    public static void main(String[] args) {

    Program candies = new Program();

    // passing value to attributes
    candies.candies = "chocolate";
    candies.flavor = "bitter chocolate";
    candies.type = "chocolate";
    candies.weight = 40.0;

        System.out.println(candies.candies);
        System.out.println(candies.flavor);
        System.out.println(candies.type);
        System.out.println(candies.weight);
    }
}
