// Problem Statement
// You are given an array/list say ‘ARR’ of size ‘N’.
// We call pair (i, j) a Reverse Pair when i < j and 'ARR[i]' > 2 * 'ARR[j]'.
// Your task is to find the number of Reverse Pairs present in given 'ARR'.

import java.util.ArrayList;

public class ReversePairs {
    public static int mergeWithCount(ArrayList<Integer> arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();

        int count = 0;
        int i = l;
        int j = m + 1;

        // for each element of the first set
        for (i = l; i <= m; i++) {
            while (j <= r) {
                if (arr.get(i) > 2 * arr.get(j))
                    j++;
                else
                    break;
            }
            count += j - (m + 1);
        }

        i = l;
        j = m + 1;

        while (i <= m && j <= r) {
            if (arr.get(i) < arr.get(j)) {
                temp.add(arr.get(i++));
            } else {
                temp.add(arr.get(j++));
            }
        }

        while (i <= m) {
            temp.add(arr.get(i++));
        }

        while (j <= r) {
            temp.add(arr.get(j++));
        }

        for (i = l; i <= r; i++) {
            arr.set(i, temp.get(i - l));
        }
        return count;
    }

    public static int mergeSortWithCount(ArrayList<Integer> arr, int l, int r) {
        if (l >= r)
            return 0;
        int count = 0;
        int m = l + (r - l) / 2;
        count += mergeSortWithCount(arr, l, m);
        count += mergeSortWithCount(arr, m + 1, r);
        count += mergeWithCount(arr, l, m, r);

        return count;
    }

    public static int reversePairs(ArrayList<Integer> arr) {
        int n = arr.size();
        // Write your code here.
        // brute
        // int count = 0;
        // for(int i=0;i<n-1;i++) {
        // for(int j=i+1;j<n;j++) {
        // if(arr.get(i) > 2*arr.get(j))
        // count++;
        // }
        // }
        // return count;

        // using mergeSort technique
        return mergeSortWithCount(arr, 0, n - 1);
    }
}
