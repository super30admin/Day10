/**
*Time Complexity - O(m * n) - m represents rows, n represents columns
*Space Complexity - O(1) - As we are not using any extra space than variables
*/

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while( startRow <= endRow && startColumn <= endColumn ) {
            //Traverse same row different columns
            for(int i = startColumn; i <= endColumn; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;
            //Traverse same column from last different rows
            for(int i = startRow; i <= endRow ; i++) {
                result.add(matrix[i][endColumn]);
            }
            endColumn--;
            //Traverse same row from bottom different columns
            if(startRow <= endRow) {
                for(int i = endColumn ; i >= startColumn; i--){
                    result.add(matrix[endRow][i]);
                }
            }
            endRow--;
            //Traverse same column from first different rows
            if(startColumn <= endColumn) {
                for(int i = endRow; i>= startRow; i--) {
                    result.add(matrix[i][startColumn]);
                }
            }
            startColumn++;
        }
        return result;

    }
}