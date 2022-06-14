// Given an ‘N’ x ‘M’ integer matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
// In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i][j] == 0), then all the cells of the ith row and jth column should be changed to 0.
// You must do it in place.

public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        // best technique
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean firstColSet = false;
        for(int i=0;i<rows;i++) {
            if(matrix[i][0] == 0)
                firstColSet = true;

            for(int j=1;j<cols;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=rows-1;i>=0;i--) {
            for(int j=cols-1;j>=1;j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }

            if(firstColSet)
                matrix[i][0] = 0;
        }
    }
}
