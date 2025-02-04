//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Time Complexity : O(mxn)
// Space Complexity : O(mxn)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, there are 4 cases to consider moving on top, right, bottom and left side. The conditions are written on how moving takes place. While
 * moving top, go across left to right and increase top. While moving right side, go across top to bottom and decrease right. While moving 
 * bottom side, go across right to left and decrease bottom. While moving across left side, go across bottom to top and increase left. The 
 * resultant list gives the spiral order of the matrix 
 */

 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int dir = 1; // right
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(left<=right && top <=bottom){
            //top layer
            for(int j=left; j<=right;j++){
                res.add(matrix[top][j]);
            }
            top++;

            // right
            for(int i=top; i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;

            //bottom layer
            if(top <=bottom){
                for(int j=right; j>=left;j--){
                res.add(matrix[bottom][j]);
            }
            bottom--;
            }

            //left
            if(left<=right){
                for(int i=bottom; i>=top;i--){
                res.add(matrix[i][left]);
            }
            left++;
            }
        }
        return res;
    }
}