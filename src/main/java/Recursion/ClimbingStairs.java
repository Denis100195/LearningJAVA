package Recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    /*You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways
    can you climb to the top?*/

    public int climbStairs(int n) {
        Map <Integer, Integer> cache = new HashMap<>();
        return fib(n, cache);

    }
    public int fib(int n, Map<Integer, Integer> storedValues) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (storedValues.containsKey(n)) {
            return storedValues.get(n);
        }
        int result = fib(n - 1, storedValues) + fib(n - 2, storedValues);
        storedValues.put(n, result);
        return result;
    }
}
