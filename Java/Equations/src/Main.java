public class Main {
    public static void main(String[] args) {

        Equations calc = new Equations();

        calc.letters[0] = - 2;
        calc.letters[1] = 2;
        calc.letters[2] = 3;

        System.out.println(calc.bhaskara(calc.letters));

    }
}
