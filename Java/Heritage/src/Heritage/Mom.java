package Heritage;

public class Mom {
    private String letter;
    public int number;

    public Mom(){
        this.letter = "S";
    }

    public Mom(int num1){
        this.number = 0;
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

    public int getOperation(){
        return this.number + 35;
    }
}
