package Second;
import Principal.ExProtected;

public class UseProtected extends ExProtected {
    void test(){
        flavor = "Vanilla";
        showFlavor();
    }

    public static void main(String[] args) {
        UseProtected newFlavor = new UseProtected();
        newFlavor.test();
    }
}
