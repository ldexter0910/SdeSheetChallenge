// You are given an array (ARR) of length N, consisting of integers.
// You have to find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
// A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning, and 0 or more integers from the end of an array.
// Note :
// The sum of an empty subarray is 0.

public class MaxSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxSubSum = 0;
        long currSum = 0;

        for (int i = 0; i < n; i++) {
            if (currSum + arr[i] >= arr[i]) {
                currSum += arr[i];
            } else {
                currSum = arr[i];
            }
            maxSubSum = Math.max(maxSubSum, currSum);
        }
        return maxSubSum;
    }
}
