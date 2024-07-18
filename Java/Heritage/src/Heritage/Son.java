package Heritage;

public class Son extends Mom{

    String letter2;
    public Son(){
        this.letter2 = "I";
    }

    public String getLetter() {
        return letter2;
    }

    public void setLetter(String letter) {
        this.letter2 = letter;
    }

    public String getjunction(){
        return getText() + " " + getLetter();
    }
}
