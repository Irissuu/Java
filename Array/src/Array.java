public class Array {
    public static void main(String[] args) {

        // from this
        /**
         int number1 = 1;
         int number2 = 2;
         int number3 = 5;
         int number4 = 4;
        **/

        // to this
        // This Java code creates an array called "number" that contains the numbers 1, 2, 3,4.
        // It then declares a variable "n" and initializes it to 0.
        int number[] = {1, 2, 3, 4};
        int n  = 0;

        // Then, it starts a "while" loop that continues as long as the value of "n" is less than 4.
        // Inside the loop, it prints the array element "number" in position "n" and then increments the value of "n" by 1.
        while(n < 4){
            System.out.println(number[n]);
            n++;
        }



    }
}
