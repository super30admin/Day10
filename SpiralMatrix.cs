// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//The algorithm starts at the top-left corner of the matrix and traverses it in a spiral order, moving from left to right, then top to bottom, right to left, and finally bottom to top, repeating this pattern.
//It uses four boundary markers (top, bottom, left, and right) to track the area yet to be traversed and adjusts these boundaries as elements are added to the result.
//The process continues until all the elements in the matrix are traversed, at which point the result list is returned.

public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        IList<int> result = new List<int>();

        if (matrix.Length == 0) return result;

        int rows = matrix.Length;
        int columns = matrix[0].Length;
        int top = 0, bottom = matrix.Length - 1;
        int left = 0, right = matrix[0].Length - 1;

        while(top <= bottom && left <= right){
            for(int i = left; i<= right; i++){
                result.Add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                result.Add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>= left; i--){
                result.Add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i= bottom; i>=top; i--){
                result.Add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}