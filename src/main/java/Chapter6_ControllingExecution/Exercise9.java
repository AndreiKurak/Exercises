package Chapter6_ControllingExecution;

import java.util.Arrays;

/**
 * Exercise 9:   (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
 *                   34, and so on, where each number (from the third on) is the sum of the previous two. Create
 *                   a method that takes an integer as an argument and displays that many Fibonacci numbers
 *                   starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
 *                   name of the class) the output will be: 1, 1, 2, 3, 5.
 */
public class Exercise9 {

    public static void Fibonacci(int n){
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i<n; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }
        System.out.println(Arrays.toString(fib));
    }

    public static void main(String[] args){
        Exercise9.Fibonacci(27);
    }

}
