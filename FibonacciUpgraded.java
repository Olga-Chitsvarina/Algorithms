package Algorithms;

import java.util.Scanner;

/**
 * Created by Olga Chitsvarina on 15.09.2017.
 * This is a simple program that prompts the user for the non-negative
 * integer n, computes the value of the n-th Fibonacci number (based on
 * the definition), and prints it out.
 */
public class FibonacciUpgraded {

    /**
     * This method: 1) runs the program 2) prompts the user for the
     * non-negative integer input n 3) reads the typed in number n
     * value 4) calls the method fib to compute the value of the n-th
     * Fibonacci number 5) extracts the n-th Fibonacci number from
     * the returned by fib method array 6) prints out the value of
     * the n-th Fibonacci number to the screen.
     * @param args - is used in the main method declaration
     */
    public static void main (String args []){

        // Prompt the user for the positive integer n:
        System.out.println( "Enter an integer n, such that n>=0," +
                " to compute the value" +
                " of the n-th Fibonacci number:");

        // Read the input:
        Scanner scannerHelper = new Scanner(System.in);
        int input = scannerHelper.nextInt();

        // Compute and display the result:
        System.out.println( "The value of the n-th Fibonacci number" +
                " is: " + "\n" + (fib(input)[0]));
    }

    /**
     * Using the value of the parameter n, this method computes
     * the value of the 1) n-th Fibonacci number and 2) (n+1)-th
     * Fibonacci number. It returns the array of size 2, the position
     * at index 0 contains the integer value of the n-th Fibonacci
     * number and the position at index 1 contains the integer value
     * of the (n+1)-th Fibonacci number.
     * @param n is a non-negative integer.
     * @return an array of size 2, the position
     * at index 0 contains the integer value of the n-th Fibonacci
     * number and the position at index 1 contains the integer value
     * of the (n+1)-th Fibonacci number. Fn is a positive integer or
     * zero, which corresponds to the value of the n-th Fibonacci number.
     * F(n+1) is a positive integer, which corresponds to the value of
     * the (n+1)-th Fibonacci number.
     */
    public static int[] fib (int n){

        // Assertion:
        // 1) n is an integer input, n>=0.

        // The Bound Function is: n

        if (n == 0)
        {
            // Assertion:
            // 1) n is an integer input, n=0.

            return (new int[] {0,1});

            // Assertion:
            // 1) n is an integer input, n=0.
            // 2) Array of size 2 has been returned as the output:
            //      By the definition of the n-th Fibonacci number
            //      for the case n=0
            //      array[0] = F0 = 0
            //      array[1] = F1 = 1
        }

        else
        {
            // Assertion:
            // 1) n is an integer input, n >= 1.

            int[] myArray = fib(n-1);           // Return the myArray = {F(n-1), F(n)}
            int fn = myArray[1];                // Integer fn = myArray[1] = F(n), fn >= 1
            int fnPlusOne = myArray[0] + fn;    // Integer fnPlusOne = F(n-1) + F(n) = F(n+1), fnPlusOne >= 2
            return (new int[]{fn, fnPlusOne});  // Return an array = {F(n), F(n+1)}

            // Assertion:
            // 1) n is an integer input, n >= 1.
            // 2) Array of size 2 has been returned as the output:
            //      By the definition
            //      array[0] =  Fn      = F(n-2) + F(n-1)
            //      array[1] =  F(n+1)  = F(n-1) + Fn
            //      Exception is the case n=1, Fn = 1, F(n+1) = 0 + (1 = Fn)
        }

        // Assertion:
        // 1) n is an integer input, n >= 0.
        // 2) Array of size 2 has been returned as the output:
        //      By the definition of the n-th Fibonacci number
        //          if n = 0, then array returned = {0,1}
        //          else array returned = {F(n), F(n+1)}, such that
        //          array[0] =  Fn      = F(n-2) + F(n-1)
        //          array[1] =  F(n+1)  = F(n-1) + Fn
    }

}
