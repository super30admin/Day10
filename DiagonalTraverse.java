// Time Complexity : O (m x n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        while(k < m * n) {
            result[k++] = mat[i][j];
            // when sum of row & col is even, direction is ↗
            if ((i + j) % 2 == 0) {
                if (j == n - 1) i++; // at the last column, go ↓
                else if (i == 0) j++; // at the first row; non-last column, go →
                else { i--; j++; } // all other cases, continue ↗
            }
            // when sum of row & col is even, direction is ↙
            else {
                if (i == m - 1) j++; // at the last row, go →
                else if (j == 0) i++; // at the first column; non-last row, go ↓
                else { i++; j--; } // all other cases, continue ↙
            }
        }
        return result;
    }
}
