// Problem Statement
// You are given an integer array 'ARR' of size 'N' and an integer 'S'.
// Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        List<Integer[]> res = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : arr) {
            if (m.containsKey(s - x)) {
                for (int i = 0; i < m.get(s - x); i++) {
                    res.add(
                            new Integer[] {
                                    Math.min(x, s - x),
                                    Math.max(x, s - x)
                            });
                }
            }
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        Collections.sort(res, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int[][] resArr = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            resArr[i][0] = res.get(i)[0];
            resArr[i][1] = res.get(i)[1];
        }

        return resArr;
    }
}