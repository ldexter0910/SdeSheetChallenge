// Problem Statement
// You are given an array of integers 'ARR' containing N elements. Each integer is in the range [1, N-1], with exactly one element repeated in the array.
// Your task is to find the duplicate element.

import java.util.ArrayList;

public class FindRepeatingNumber {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        // input tampering solution
        // for(int i=0;i<n;i++) {
        // int x = Math.abs(arr.get(i));
        // if(arr.get(x) < 0)
        // return x;
        // arr.set(x, arr.get(x)*-1);
        // }
        // return -1;

        // floyd cycle detection algo
        int slow = arr.get(0);
        int fast = arr.get(0);

        do {
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        } while (slow != fast);

        slow = arr.get(0);
        while (slow != fast) {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }

        return slow;
    }
}
