// Problem Statement
// You have been given an integer array/list(ARR) of size 'N'.
// It only contains 0s, 1s and 2s.
// Write a solution to sort this array/list.
// Note :
// Try to solve the problem in 'Single Scan'.
// ' Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
public class Sort012 {
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void sort012(int[] arr) {
        // Write your code here
        int n = arr.length;

        int lowEnd = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (arr[start] == 0) {
                Sort012.swap(arr, ++lowEnd, start++);
            } else if (arr[start] == 1) {
                start++;
            } else {
                Sort012.swap(arr, end--, start);
            }
        }
    }
}
