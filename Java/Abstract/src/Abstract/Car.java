package Abstract;

public class Car extends Vehicle{

    @Override
    public void turnOn(){
        System.out.println("[CAR]: On.");
    }

    @Override
    public void turnOff(){
        System.out.println("[CAR]: Off.");
    }

    @Override
    public void move(){
        System.out.println("[CAR]: Moving.");
    }
}
