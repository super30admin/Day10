// Time Complexity : O(mn)
// Space Complexity : O(1)- since we are returning the result we need not add it to the space complexity
// Did this code successfully run on Leetcode : Yes

/*
 * 1. Consider a middle element-> if going upwards r-- & c++ ; if going downwards r++ & c--
 * Boundary conditions:
 * Upward extreme right -> if c == n-1 go down incrementing row (do this before row check because we are looking for extreme right in the same row) 
 *                          all others if r==0 go down incremeting column
 * 
 * Downward -> if r==m-1 go up incrementing the column (do this before column check because all elements in column 0 would come in else if) 
 *              all others if c==0 go upward incrementing 
 */

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0;
        boolean direction = true;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];
            if (direction) {
                if (c == n - 1) {
                    r++;
                    direction = !direction; // go down
                } else if (r == 0) {
                    c++;
                    direction = !direction;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    direction = !direction;
                } else if (c == 0) {
                    r++;
                    direction = !direction;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;

    }
}
