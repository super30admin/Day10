// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class DiagonalMatrix {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[n * m];

        boolean dir = true; // true -> upward direction
        int idx = 0;
        int r = 0, c = 0;
        while (idx < n * m) {
            result[idx] = mat[r][c];
            idx++;
            if (dir) {
                if (c == n - 1) {
                    r++;
                    dir = false;
                } else if (r == 0) {
                    c++;
                    dir = false;
                } else {

                    r--;
                    c++;

                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = true;
                } else if (c == 0) {

                    r++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }

            }
        }
        return result;
    }
}