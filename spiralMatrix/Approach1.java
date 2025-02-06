package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class Approach1 {

    public static void main(String[] args) {

//        int[][] matrix = {{1,2, 3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0 || matrix == null || matrix[0].length == 0) {
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int rowBeign = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (rowBeign <= rowEnd && colBegin <= colEnd) {

            for (int j = colBegin; j <= colEnd; j++) {
                result.add(matrix[rowBeign][j]);
            }
            rowBeign++;

            for (int i = rowBeign; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBeign <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    result.add(matrix[rowEnd][j]);
                }

            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBeign; i--) {
                    result.add(matrix[i][colBegin]);
                }

            }
            colBegin++;


        }
        return result;
    }
}
