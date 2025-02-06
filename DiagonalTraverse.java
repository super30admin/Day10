import java.util.Arrays;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class DiagonalTraverse {
    public static void main(String[] args)
    {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2},{3,4}};
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }

    public static int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null) {
            return new int[] {};
        }

        int m = matrix.length;

        if (m == 0) {
            return new int[] {};
        }

        int n = matrix[0].length;

        if (n == 0) {
            return new int[] {};
        }

        int[] result = new int[m * n];
        int idx = 0;
        int row = 0;
        int col = 0;

        // upwards
        boolean up = true;

        while (idx < m * n) {
            result[idx] = matrix[row][col];
            idx++;

            // even
            // move upwards
            if (up) {

                if(col == n - 1) {
                    row++;
                    up = false;
                } else if(row == 0) {
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }

            }
            // moving downwards -- down
            else {

                if(row == m - 1) {
                    col++;
                    up = true;
                } else if(col == 0) {
                    row++;
                    up = true;
                } else {
                    row++;
                    col--;
                }

            }

        }

        return result;
    }
}
