// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length; //Calc the row
        int col = matrix[0].length; //Calc the col
        List<Integer> result = new ArrayList<>();
        int top = 0; //Calc the 4 pointers
        int left = 0;
        int bottom = row - 1;
        int right = col - 1;

        while(bottom >= top && right >= left){ //When the bottom pointer is greater than top and right is greater than left
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]); //Add it to the list
            }
            top++;
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            for(int j = bottom; j >= top; j--){
                result.add(matrix[j][left]);
            }
            left++;
        }
        return result;
    }
}