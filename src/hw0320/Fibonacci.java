package hw0320;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Fibonacci.java
 */
//        The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//        Write a program which accepts as input an integer N and returns the N-th Fibonacci number.
//        To test whether your program returned the correct number, go to Wolfram Alpha,
//        and enter fibonacci(N) where N is your input integer


public class Fibonacci
{
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int n)
    {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        if (n == 0)
        {
            return 0;
        }
        if (n == 1){
            return 1;
        }
        for(int i = 2; i <= n; i++) {
            int numOne = fibonacciNumbers.get(i - 1);
            int numTwo = fibonacciNumbers.get(i - 2);
            int numThree = numOne + numTwo;
            fibonacciNumbers.add(numThree);
            }
        return fibonacciNumbers.get(n);

        }
    }
