// Time Complexity :    O(m x n)
// Space Complexity :   O(m x n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - Moving up and down basically requires moving of the pointers which starts with the direction condition which if true will move up or else will move down.

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        if (mat == null) return result;
        int i = 0; int j = 0;       //matrix location
        boolean dir = true;
        while (idx < m * n) {    
            result[idx] = mat[i][j];    //initialising index with 0,0 positions
            idx ++;
            //find new location of i, j
            if (dir) {
                //up
                if (j == n - 1) {
                    i ++;
                    dir = false;
                } else if (i == 0) {    //this is second condition to avoid out of bounds error at top right corner
                    j ++;
                    dir = false;
                } else {
                    i --;
                    j ++;
                }
            } else {
                //moving down
                if (i == m - 1) {
                    j ++;
                    dir = true;
                } else if (j == 0) {    //same reason why this is the second condition at bottom left corner
                    i ++;
                    dir = true;
                } else {
                    i ++; 
                    j --;
                }
            }
        }
        return result;
    }
}