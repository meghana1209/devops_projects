package com.fib;

/**
 * program for generating fib numbs 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
    }
}
}

