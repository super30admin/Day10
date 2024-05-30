// Time Complexity : O(m * n)
// Space Complexity : O(1) as we are using only 1 array and we are returning it.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:

// Define boundaries for the top, bottom, left, and right edges of the matrix.
// Traverse the matrix in a spiral order by moving right across the top row, down the right column, left across the bottom row, and up the left column, adjusting boundaries after each direction change.
// Continue this process until all elements are added to the result list, ensuring no out-of-bound errors by checking boundary conditions.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if( matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top =0, bottom = m-1;
        int left = 0, right = n-1;

        while(top <= bottom && left <= right){

            // move from left to right
            for(int j=left; j<= right; j++){
                result.add(matrix[top][j]);
            }
            top++;

            // move from top to bottom
            for(int j=top ; j<= bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;

            // move from right to left
            if(top <= bottom){
                for(int j= right; j>= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // move from bottom to top
            if(left <= right){
                for(int j= bottom; j >= top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }

        return result;
    }
}