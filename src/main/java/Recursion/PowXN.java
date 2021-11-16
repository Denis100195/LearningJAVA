package Recursion;

public class PowXN {
    public double myPow(double x, int n) {
        // Fast Power Algorithm O(logn)
        // Binary representation of n
        boolean isMinus = false;
        long N = n; // n can be -2^31
        if (n < 0) {
            isMinus = true;
            N = -N;
        }
        double ans = 1.0;
        for (long i = N; i > 0; i >>= 1) {
            if ((i & 1) != 0) ans *= x;
            x *= x;
        }
        if (isMinus) ans = 1 / ans;
        return ans;
    }
}
