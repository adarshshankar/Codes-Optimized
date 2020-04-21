package com.adarsh.Test1;

public class FibOptimizedMemoization {
    public static long[] fibArray = new long[250];

    public static void main(String[] args) {
        fibArray[0] = 1;
        fibArray[1] = 1;

        long preTime = System.currentTimeMillis();
        System.out.println(fib(200));
        long postTime = System.currentTimeMillis();
        System.out.println("total time to compute=== " + (postTime - preTime));

    }

    public static long fib(long n) {

        if (n <= 1)
            return n;
        else if (fibArray[(int) n] != 0)   //comment these two lines 
            return fibArray[(int) n];      // and see the difference with different values of n.
        else {

            long fibValue = fib(n - 1) + fib(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }


    }
}
