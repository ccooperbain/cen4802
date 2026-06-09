import java.util.Scanner;

/**
 * Christopher Cooper Bain
 * This program prints the nth value of the Fibonacci sequence.
 */



public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter the number of the nth term for the Fib sequence >");
        int term = input.nextInt();
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + fibonacci(term));
    }
    private static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
