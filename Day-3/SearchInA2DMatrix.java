// Problem Statement
// You have been given a 2-D array 'MAT' of size M x N where 'M' and 'N' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order.
// Moreover, the first element of a row is greater than the last element of the previous row (if exists).
// You are given an integer 'TARGET' and your task is to find if it exists in the given 'MAT' or not.

import java.util.ArrayList;

public class SearchInA2DMatrix {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> arr, int m, int n, int target) {
        // Write your code here.
        // O(m+n) solution
        // int i = m-1;
        // int j = 0;

        // while(i >= 0 && j <n) {
        // int x = arr.get(i).get(j);
        // if(x == target)
        // return true;
        // else if(x > target)
        // i--;
        // else
        // j++;
        // }

        // return false;

        // O(logm + logn) solution

        int row = -1;

        int l = 0;
        int r = m - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target <= arr.get(mid).get(n - 1)) {
                row = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (row == -1)
            return false;

        l = 0;
        r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int x = arr.get(row).get(mid);
            if (x == target)
                return true;
            else if (x > target)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return false;
    }
}