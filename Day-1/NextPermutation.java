// Problem Statement
// You have been given a permutation of ‘N’ integers.
// A sequence of ‘N’ integers is called a permutation if it contains all integers from 1 to ‘N’ exactly once.
// Your task is to rearrange the numbers and generate the lexicographically next greater permutation.
// To determine which of the two permutations is lexicographically smaller, we compare their first elements of both permutations.
// If they are equal — compare the second, and so on.
// If we have two permutations X and Y, then X is lexicographically smaller if X[i] < Y[i], where ‘i’ is the first index in which the permutations X and Y differ.
// For example, [2, 1, 3, 4] is lexicographically smaller than [2, 1, 4, 3].

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    public static void swap(ArrayList<Integer> arr, int l, int r) {
        int temp = arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r, temp);
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int n = permutation.size();
        // k denotes the starting index of the decreasing order from the last of the permutation
        int k;
        for(k=n-1;k>0;k--) {
            if(permutation.get(k-1) < permutation.get(k))
                break;
        }
        
        if (k == 0) {
            Collections.reverse(permutation);
            return permutation;
        }
      
        // l denotes the integer in the decreasing order end part which is just greater than the integer at k-1 index
        int l = k;
        for(int i=k;i<n;i++) {
            if(permutation.get(k-1) <= permutation.get(i)) {
                l = i;
            }
        }
        
        // swap l and k-1 indexes
        NextPermutation.swap(permutation, k-1, l);
        
        // reverse the second part of the resulting permutation
        int start = k;
        int end = n-1;
        while(start < end) {
            NextPermutation.swap(permutation, start++, end--);
        }
        
        return permutation;
	}
}
