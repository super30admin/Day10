//Time Complexity: O(n*m)
//Space Complexity: O(n*m)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We traverse through matrix based on direction, in both the directions
// upwards and downwards, we calculate the edge cases.
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int row = 0;
        int col = 0;
        int index = 0;
        boolean flag = true;

        while(index < m*n) {
            res[index] = mat[row][col];
            index++;

            // if direction is upwards
            if(flag) {
                if(col == n-1) {
                    row++;
                    flag = false;
                }
                else if(row == 0) {
                    col++;
                    flag = false;
                }
                else {
                    col++;
                    row--;
                }
            } else { // direction is downwards
                if(row == m-1){
                    col++;
                    flag = true;
                }
                else if(col == 0){
                    row++;
                    flag = true;
                }
                else {
                    col--;
                    row++;
                }
            }
        }

        return res;

    }
}

