// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * iterate through the matrix while maintaining indices r and c for row and column respectively,
 *  and a boolean flag to determine the direction of movement (up-right or down-left).
 *  It populates the result array with elements from the matrix in diagonal order,
 *  starting from the top-left corner and zigzagging through the matrix until all elements are included in result.
 */

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int [m*n];
        int r = 0; int c = 0;
        int idx = 0; // idx of result arr
        boolean flag = true;
        while(idx < m*n){
            result[idx] = matrix[r][c];
            idx++;
        if(flag){
            if(c == n -1){
            r++; flag = false;
            } else if(r== 0){
                c++; flag = false;
            } else {
                r--; c++;
            }
        } else {
                if(r == m -1){
                    c++; flag = true;
                } else if(c == 0){
                    r++; flag = true;
                } else {
                    c--; r++;
                }
            }
        }
        return result;
    }
}