public class Test {
    private Planets planet;

    public Test(String planetName) {
        try {
            this.planet = Planets.valueOf(planetName);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
            this.planet = null;
        }
    }

    public void travelPlanet() {
        if (planet == null) {
            System.out.println("Unable to locate planet or tickets sold out");
            return; // Exit the method if planet is null
        }

        // Now safely switch on the planet
        switch (planet) {
            case NEPTUNE:
                System.out.println("Taking off for Neptune");
                break;
            case MARS:
                System.out.println("Taking off for Mars");
                break;
            case VENUS:
                System.out.println("Taking off for Venus");
                break;
            case SATURN:
                System.out.println("Taking off for Saturn");
                break;
            case MERCURY:
                System.out.println("Taking off for Mercury");
                break;
            case EARTH:
                System.out.println("Taking off for Earth");
                break;
            case URANUS:
                System.out.println("Taking off for Uranus");
                break;
            default:
                System.out.println("Unable to locate planet or tickets sold out");
                break;
        }
    }
}
