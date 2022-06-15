// Problem Statement
// For a given integer array/list 'ARR' of size 'N' containing all distinct values, find the total number of 'Inversions' that may exist.
// An inversion is defined for a pair of integers in the array/list when the following two conditions are met.

public class CountInversions {
    public static long merge(long arr[], int l, int m, int r) {
        long inversions = 0;
        
        int n1 = m-l+1;
        int n2 = r-m;
        long arr1[] = new long[n1];
        long arr2[] = new long[n2];
        
        for(int i=l;i<=m;i++)
            arr1[i-l] = arr[i];
        
        for(int i=m+1;i<=r;i++)
            arr2[i-m-1] = arr[i];
        
        int i = 0, j = 0, k = l;
        
        while(i < n1 && j < n2) {
            if(arr1[i] > arr2[j]) {
                inversions += (m+1) - (l+i);
                arr[k++] = arr2[j++];
            } else {
                arr[k++] = arr1[i++];
            }
        }
        
        while(i < n1) {
            arr[k++] = arr1[i++];
        }
        
        while(j < n2) {
            arr[k++] = arr2[j++];
        }
        
        return inversions;
    }
    public static long mergeSort(long arr[], int l, int r) {
        long inversions = 0;
        if(l<r) {
            int m = l + (r-l)/2;
            inversions = mergeSort(arr, l, m);
            inversions += mergeSort(arr, m+1, r);
            inversions += merge(arr, l, m, r);
        }
        return inversions;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergeSort(arr, 0, n-1);
    }
}
