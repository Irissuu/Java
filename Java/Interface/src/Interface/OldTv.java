package Interface;

public class OldTv implements Television{

    @Override
    public void turnOn() {
        System.out.println("[OLD TV]: On");
    }

    @Override
    public void turnOff() {
        System.out.println("[OLD TV]: Off");
    }

    @Override
    public void changeVolume() {
        System.out.println("[OLD TV]: Changing volume");
    }

    @Override
    public void changeChannel() {
        System.out.println("[OLD TV]: Changing channel");
    }
}
