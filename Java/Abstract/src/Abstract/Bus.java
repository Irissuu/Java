package Abstract;

public class Bus extends Vehicle{

    @Override
    public void turnOff(){
        System.out.println("[BUS]: Off.");
    }

    @Override
    public void move(){
        System.out.println("[BUS]: Moving.");
    }
}
