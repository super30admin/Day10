import java.util.*;

// Time Complexity :    O(m x n)
// Space Complexity :   O(m x n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0; int bottom = m -1;
        int left = 0; int right = n - 1;

        while (top <= bottom && left <= right) {
            //top 
            for (int j = left; j <= right; j ++) {
                result.add(matrix[top][j]);
            }
            top ++;

            //right
            for (int i = top; i <= bottom; i ++) {
                result.add(matrix[i][right]);
            }
            right --;

            //bottom
            if (top <= bottom) {
            for (int j = right; j >= left; j --) {
                result.add(matrix[bottom][j]);
            }
            bottom --;
            }

            if (left <= right){
            //left
            for (int i = bottom; i >= top; i --) {
                result.add(matrix[i][left]);
            }
            left ++;
            }
        }
        return result;
    }
}


//recursive soln

// Time Complexity :    O(m x n)
// Space Complexity :   O(m x n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        helper(matrix, result, top, right, left, bottom);
        return result;
    }
    private void helper(int[][] matrix, List<Integer> result, int top, int right, int left, int bottom){
            if(top > bottom || left > right) return;
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
            
           if(top <= bottom){
            // bottom
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
           }
            if( left <= right){
                // left
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            helper(matrix, result, top, right, left, bottom);
            
       
    }
}