public class DoWhile {
    public static void main(String[] args) {

        int cont = 0;

        // "do" will first execute all the code inside it before going to "while", it only runs once
        do{
            System.out.println(cont);
            cont++;
        }while (cont < 0); // so then while will do the check
            System.out.println(cont);
    }
}
