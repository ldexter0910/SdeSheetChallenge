// Problem Statement
// You are given an array/list 'ARR' of ‘N’ integers and an integer value ‘TARGET’.
// You need to check whether there exist four numbers (ARR[i], ARR[j], ARR[k], ARR[l]) such that (0 <= i < j < k < l < N) and ARR[i] + ARR[j] + ARR[k] + ARR[l] = 'TARGET'.

import java.util.Arrays;

public class FourSum {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = target - arr[i] - arr[j];
                int l = j + 1;
                int r = n - 1;

                while (l < r) {
                    int sum = arr[l] + arr[r];
                    if (sum == x)
                        return "Yes";
                    else if (sum < x)
                        l++;
                    else
                        r--;
                }
            }
        }
        return "No";
    }
}
