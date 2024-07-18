package Heritage;

public class Mom {
    String letter;

    public Mom(){
        this.letter = "S";
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getText(){
        return this.letter + " com ";
    }
}
