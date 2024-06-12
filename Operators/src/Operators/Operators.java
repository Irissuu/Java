package Operators;

public class Operators {
    public static void main(String[] args) {

        // increment and decrement operators
        int n1 = 2;
        int n2 = 4;

        n1++;
        System.out.println("Increment 1: " + n1);
        n2++;
        System.out.println("Increment 2: " + n2);

        n1--;
        System.out.println("Decrement 1: " + n1);
        n2--;
        System.out.println("Decrement 2: " + n2);

        System.out.println("----------------");
        
        // relational operators, return boolean
        int n3 = 3;
        int n4 = 4;

        /*
        * == equal
        * != different
        * > higher
        * < lower
        * >= higher or equal
        * <= lower or equal
        * */

        boolean equal = n3 == n4;
        boolean different = n3 != n4;
        boolean higher = n3 > n4;
        boolean lower = n3 < n4;
        boolean higherEqual = n3 >= n4;
        boolean lowerEqual = n3 <= n4;


        System.out.println("Equal (3 and 4): " + equal);
        System.out.println("Different (3 and 4): " + different);
        System.out.println("Higher (3 and 4): " + higher);
        System.out.println("Lower (3 and 4): " + lower);
        System.out.println("Higher or equal (3 and 4): " + higherEqual);
        System.out.println("Lower or equal (3 and 4): " + lowerEqual);
    }
}