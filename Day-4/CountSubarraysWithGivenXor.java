// Problem Statement
// Given an array of integers ‘ARR’ and an integer ‘X’, you are supposed to find the number of subarrays of 'ARR' which have bitwise XOR of the elements equal to 'X'.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenXor {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        // Write your code here.
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        int xor = 0;
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            xor ^= arr.get(i);
            if (m.containsKey(xor ^ x))
                ans += m.get(xor ^ x);
            m.put(xor, m.getOrDefault(xor, 0) + 1);
        }
        return ans;
    }
}
