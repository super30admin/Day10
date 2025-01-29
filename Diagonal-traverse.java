// TC = O(m + n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // TC = O(m * n), SC = O(1)
        // null
        if(mat == null || mat.length == 0) return new int[0];
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int i = 0, j = 0, idx = 0, dir = 1;
        while(idx < (m * n)) {
            result[idx++] = mat[i][j];
            if(dir == 1) {
                // Take car of 2 edge cases
                if(i == 0 && j != (n - 1)) {j++; dir = -1;}
                else if(j == (n - 1)) {i++; dir = -1;} // visualize by taking 2 matrix of odd & even col
                else {i--; j++;}
            }
            else {
                // reverese i & j, m & n, dir
                if(j == 0 && i != (m - 1)) {i++; dir = 1;}
                else if(i == (m - 1)) {j++; dir = 1;}
                else {j--; i++;}
            }
        }
        return result;
    }
}