// Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order 

// Time Complexity : O(mxn)
// Space Complexity : O(mxn)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, there are 2 cases, moving upward and moving downward. While moving upward we check for edge cases where it reaches the top or right side.
 * While moving downward we check for edge cases where it reaches the bottom or left side. In other cases we will decrease row and increase column
 * for upside and reverse is for downside. 
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[]{};
        }
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m*n];
        boolean dir = true;
        int i=0,j=0;
        int idx=0;
        while(idx < m*n){
            arr[idx] = mat[i][j];
            idx++;
                //up
                if(dir){
                    if(j==n-1){
                    i++;
                    dir = false;
                }
                else if(i==0){
                    j++;
                    dir = false;
                }
                else{
                    i--;
                    j++;
                }
                }
                //down
                else{
                    if(i==m-1){
                    j++;
                    dir = true;
                }
                else if(j==0){
                    i++;
                    dir = true;
                }
                else{
                    i++;
                    j--;
                }
                }
        }
        return arr;
    }
}
