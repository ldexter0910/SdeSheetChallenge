// Ninja has been given two sorted integer arrays/lists ‘ARR1’ and ‘ARR2’ of size ‘M’ and ‘N’.
// Ninja has to merge these sorted arrays/lists into ‘ARR1’ as one sorted array.
// You may have to assume that ‘ARR1’ has a size equal to ‘M’ + ‘N’ such that ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in ‘ARR1’.
public class MergeTwoSortedArrays {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int firstPointer = m-1;
        int secondPointer = n-1;
        int k = m+n-1;
        
        while(firstPointer >= 0 || secondPointer >= 0) {
            if(firstPointer < 0) {
                arr1[k--] = arr2[secondPointer--];
            } else if(secondPointer < 0) {
                arr1[k--] = arr1[firstPointer--];
            } else {
                arr1[k--] = arr1[firstPointer] > arr2[secondPointer] ?
                    arr1[firstPointer--] : arr2[secondPointer--];
            }
        }
        return arr1;
    }
}
