// Time Complexity : O(m*n) where m is the number of rows and n is the number of columns in the matrix
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We are traversing the matrix in the direction of the spiral. We are using 4 pointers to keep track of the boundaries of the matrix. We are updating the pointers based on the direction of the spiral.

// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/
class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1, right = n-1, left = 0;
        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            // top
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;

            // right
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;


            // bottom
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // left
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
