public class While {
    public static void main(String[] args) {

        // infinite loop (don't do this)
        /**
         * while (true){
         *     System.out.println("repeat");
         * }
         */

        int cont = 0;

        // If count (variable that is worth 0) is less than or equal to 10, it will print the variable and add 1 more
        while (cont <= 10){
            System.out.println(cont);
            // cont++;
            cont = cont + 2;
        }


    }
}
