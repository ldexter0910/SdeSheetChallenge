// Problem Statement
// You are given an integer N.
// Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.
// A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows.
// Pascal's triangle contains the values of the binomial coefficient.
// For example in the figure below.

import java.util.ArrayList;

public class PascalTrianlge {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> res = new ArrayList<>(n);
        ArrayList<Long> prevRow = new ArrayList<>();
        prevRow.add((long) 1);
        res.add(prevRow);

        for (int i = 1; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            row.add((long) 1);

            for (int j = 0; j < prevRow.size() - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add((long) 1);

            res.add(row);
            prevRow = row;
        }

        return res;
    }
}
