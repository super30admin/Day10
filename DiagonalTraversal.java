// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traverse the matrix diagonally, alternating between upward and downward diagonals,
// and store the elements in the result array following the diagonal order.

// Your code here along with comments explaining your approach

public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int idx = 0; // To track the index in the result array
        int i = 0; int j = 0;
        boolean direction = true; // direction: true for upward, false for downward

        while (idx < m*n) {
            result[idx] = mat[i][j];
            idx++;

            // If the direction is upward
            if (direction) {
                if (j == n - 1) {
                    i++;
                    direction = false;
                } else if (i == 0) {
                    j++;
                    direction = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                // If the direction is downward
                if (i == m - 1) {
                    j++;
                    direction = true;
                } else if (j == 0) {
                    i++;
                    direction = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
