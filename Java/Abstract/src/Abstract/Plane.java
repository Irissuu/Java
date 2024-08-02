package Abstract;

public class Plane extends Vehicle{

    @Override
    public void turnOn(){
        System.out.println("[PLANE]: On.");
    }

    @Override
    public void move(){
        System.out.println("[PLANE]: Moving.");
    }
}
