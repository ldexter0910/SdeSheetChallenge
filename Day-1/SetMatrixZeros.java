// Given an ‘N’ x ‘M’ integer matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
// In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i][j] == 0), then all the cells of the ith row and jth column should be changed to 0.
// You must do it in place.

public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        // better way, but not the best
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean[] rowsSet = new boolean[rows];
        boolean[] colsSet = new boolean[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(matrix[i][j] == 0) {
                    rowsSet[i] = true;
                    colsSet[j] = true;
                }
            }
        }
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(rowsSet[i] || colsSet[j])
                    matrix[i][j] = 0;
            }
        }
    }
}
