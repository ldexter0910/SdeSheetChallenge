// Problem Statement
// You are given a three integers 'X', 'N', and 'M'.
// Your task is to find ('X' ^ 'N') % 'M'.
// A ^ B is defined as A raised to power B and A % C is the remainder when A is divided by C.

public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        // recursive style
        // if(n == 0)
        // return 1;

        // long y = ((long)(x%m) * (long)(x%m)) % m;
        // int res = (modularExponentiation((int)y, n/2, m)%m);
        // if(n%2 == 0)
        // return res;
        // else
        // return (int)(((long)x *(long)res)%m);

        long res = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % m;
            }
            x = (int) (((long) x * (long) x) % m);
            n = n / 2;
        }

        return (int) res;
    }
}
