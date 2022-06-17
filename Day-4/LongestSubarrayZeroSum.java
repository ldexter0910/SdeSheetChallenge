// Problem Statement
// Ninja loves playing with numbers. So his friend gives him an array on his birthday. The array consists of positive and negative integers. Now Ninja is interested in finding the length of the longest subarray whose sum is zero.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Write your code here.
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (m.containsKey(sum)) {
                ans = Math.max(ans, i - m.get(sum));
            } else {
                m.put(sum, i);
            }
        }
        return ans;
    }
}
