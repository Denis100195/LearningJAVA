package Recursion;

import java.util.HashMap;

public class FibonacciExample {
    //Simple recursion
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    //Recursion using memoization

    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static int fib(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        //keep the result in cache
        cache.put(n, result);

        return result;
    }
}
