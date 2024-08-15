package Interface;

public class SmartTv implements Television, Smart{
    @Override
    public void turnOn() {
        System.out.println("[SMART TV]: On");
    }

    @Override
    public void turnOff() {
        System.out.println("[SMART TV]: Off");
    }

    @Override
    public void changeVolume() {
        System.out.println("[SMART TV]: Changing volume");
    }

    @Override
    public void changeChannel() {
        System.out.println("[SMART TV]: Changing channel");
    }

    @Override
    public void connectInternet() {
        System.out.println("[SMART TV]: Connecting internet");
    }

    @Override
    public void downloadApp() {
        System.out.println("[SMART TV]: Downloading App");
    }
}
