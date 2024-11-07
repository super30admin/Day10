//54. Spiral Matrix - https://leetcode.com/problems/spiral-matrix/description/
//Time Complexity: O(m*n)
//Space Complexity: O(n)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //base case
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int row = matrix.length; int column = matrix[0].length;
        int top = 0; int left = 0;
        int right = column-1; int bottom = row-1;
        while(left <= right && top <= bottom){
            //top row
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right column
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom row
            if(top <= bottom){ //edge case as left and right are handled by the for loop
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //left column
            if(left <= right){ //edge case as top and bottom is handled by the for loop
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}