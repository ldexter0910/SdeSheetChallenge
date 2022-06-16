// Problem Statement
// You have been given an array/list 'ARR' consisting of 'N' integers.
// Your task is to find the majority element in the array.
// If there is no majority element present, print -1.

public class MajorityElement {
    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0)
                candidate = arr[i];

            if (candidate == arr[i])
                count++;
            else
                count--;
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate)
                count++;
        }

        return count > (n / 2) ? candidate : -1;
    }
}
