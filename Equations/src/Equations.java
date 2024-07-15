public class Equations {

    double letters[] = {0, 0,0};

    //Actually bhaskara
    // a = 0
    // b = 1
    // c = 2
    public double bhaskara(double letters[]){
        double delta = Math.pow(letters[1], 2) - 4 * (letters[0] * letters[2]);//value of B squared subtracted by 4 multiplied by A which is multiplied by C
        double xLine1 = letters[1] + (Math.sqrt(delta) / (2 * letters[0]));// value B summed by the square root of delta divided by 2 multiplied to A
        double xLine2 = letters[1] + (Math.sqrt(delta) / (2 * letters[0]));

        return xLine1;
    }
}
