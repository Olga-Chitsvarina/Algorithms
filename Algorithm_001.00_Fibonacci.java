package Algorithms;

import java.util.Scanner;

/**
 * Created by Olga Chitsvarina on 13.09.2017.
 * This is a simple program that prompts the user for the non-negative
 * integer n, computes the value of the n-th Fibonacci number (based on
 * the definition), and prints it out.
 */
public class Fibonacci {

    /**
     * This method: 1) runs the program 2) prompts the user for the
     * non-negative integer input n 3) reads the typed in number n
     * value 4) calls the method fib to compute the value of the n-th
     * Fibonacci number 5) prints out the computed value to the screen.
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
                            " is: " + "\n" + fib(input));
    }

    /**
     * Using the value of the parameter n, this method computes the value
     * of the n-th Fibonacci number and returns it.
     * @param n is a non-negative integer.
     * @return Fn a positive integer or zero, which corresponds to the
     * value of the n-th Fibonacci number.
     */
    public static int fib (int n){

        // Assertion:
        // 1) n is an integer input, n>=0.
        
        // The Bound Function is: n

        if (n == 0)
        {
            // Assertion:
            // 1) n is an integer input, n = 0.
            return 0;
            // Assertion:
            // 1) n is an integer input, n = 0
            // 2) Fn - is a n-th Fibonacci number,
            //    Fn = F0 = 0, 0 has been returned as an output.

        }

        if (n == 1)
        {
            // Assertion:
            // 1) n is an integer input, n = 1.
            return 1;
            // Assertion:
            // 1) n is an integer input, n = 1
            // 2) Fn - is a n-th Fibonacci number,
            //    Fn = F1 = 1, 1 has been returned as an output.
        }

        else
        {
            // Assertion:
            // 1) n is an integer input, n >= 2.
           return (fib(n-1) + fib(n-2));
            // Assertion:
            // 1) n is an integer input, n >= 2
            // 2) Fn - is a n-th Fibonacci number,
            //    Fn = F(n-1) + F(n-2), Fn has been returned as an output.
        }

        // Assertion:
        // 1) n is an integer input, n>=0.
        // 2) Fn (a value of the n-th Fibonacci number) has been returned as an output.
    }

}
