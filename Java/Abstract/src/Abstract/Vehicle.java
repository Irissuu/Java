package Abstract;

public abstract class Vehicle {
    private String color = "green";
    private int passengers = 4;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void move(){
        System.out.println("[VEHICLE]: Moving.");
    }
}
