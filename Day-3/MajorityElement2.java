// Problem Statement
// You are given an array/list 'ARR' of integers of length ‘N’.
// You are supposed to find all the elements that occur strictly more than floor(N/3) times in the given array/list.

import java.util.ArrayList;

public class MajorityElement2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        // Write your code here.
        int candidate1 = -1;
        int candidate2 = -1;

        int count1 = 0;
        int count2 = 0;

        for (int x : arr) {
            if (candidate1 == x)
                count1++;
            else if (candidate2 == x)
                count2++;
            else if (count1 == 0) {
                candidate1 = x;
                count1++;
            } else if (count2 == 0) {
                candidate2 = x;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int x : arr) {
            if (x == candidate1)
                count1++;
            else if (x == candidate2)
                count2++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (count1 > arr.size() / 3)
            ans.add(candidate1);
        if (count2 > arr.size() / 3)
            ans.add(candidate2);

        return ans;
    }
}
