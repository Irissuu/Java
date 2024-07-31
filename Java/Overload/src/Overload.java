public class Overload {

    int n1;
    int n2;
    double num1;
    double num2;

    public Overload(){ }
    public Overload(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public Overload(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String operation(){
        return String.valueOf(this.n1 + this.n2);
    }

    public String operation(double num1, double num2){
        return String.valueOf(this.num1 + this.num2);
    }
}
