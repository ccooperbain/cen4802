package com.christopher.cen4802v2;

import java.util.Scanner;

/**
 * @author Christopher Cooper Bain
 * This program prints the nth value of the Fibonacci sequence.
 */



public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("<##########################################>");
        System.out.print("Enter the number of the nth term for the Fib sequence >");
        int term = input.nextInt();
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + fibonacci(term));
        System.out.println("<##########################################>");
    }

    /**
     *This method returns the value of the n'th term in the fibonacci sequence that is provided by the user.
     * @param n the nth term that the user would like to see the value of.
     * @return returns the calculation using recursion in a type integer.
     */
    protected static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
