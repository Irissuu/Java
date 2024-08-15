package Interface;

public class Main {
    public static void main(String[] args) {

        SmartTv smart = new SmartTv();
        smart.connectInternet();
        smart.changeChannel();

        OldTv old = new OldTv();
        old.turnOff();

    }
}
