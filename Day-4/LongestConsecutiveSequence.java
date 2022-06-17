// Problem Statement
// You are given an unsorted array/list 'ARR' of 'N' integers. Your task is to return the length of the longest consecutive sequence.
// The consecutive sequence is in the form ['NUM', 'NUM' + 1, 'NUM' + 2, ..., 'NUM' + L] where 'NUM' is the starting integer of the sequence and 'L' + 1 is the length of the sequence.

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        // brute
        // Arrays.sort(arr);
        // int ans = 1;
        // int currCons = 1;
        // for(int i=1;i<N;i++) {
        // if(arr[i] == arr[i-1]+1)
        // currCons++;
        // else if(arr[i] != arr[i-1])
        // currCons = 1;

        // ans = Math.max(currCons, ans);
        // }

        // return ans;

        int ans = 0;
        Set<Integer> s = new HashSet<>();
        for (int x : arr)
            s.add(x);

        for (int x : arr) {
            if (!s.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (s.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
