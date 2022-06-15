// Problem Statement
// You are given an array of size ‘N’. The elements of the array are in the range from 1 to ‘N’.
// Ideally, the array should contain elements from 1 to ‘N’. But due to some miscalculations, there is a number R in the range [1, N] which appears in the array twice and another number M in the range [1, N] which is missing from the array.
// Your task is to find the missing number (M) and the repeating number (R).

import java.util.ArrayList;

public class MissingAndRepeating {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ (i + 1) ^ arr.get(i);
        }

        // lsb = least set bit
        int lsb = xor & ~(xor - 1);
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr.get(i) & lsb) != 0) {
                x = x ^ arr.get(i);
            } else {
                y = y ^ arr.get(i);
            }

            if (((i + 1) & lsb) != 0)
                x = x ^ (i + 1);
            else
                y = y ^ (i + 1);
        }

        int[] res = new int[2];

        boolean xExists = false;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                xExists = true;
                break;
            }
        }

        if (xExists) {
            res[0] = y;
            res[1] = x;
        } else {
            res[0] = x;
            res[1] = y;
        }

        return res;
    }
}
