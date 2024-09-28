// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
/*
 * Maintain 4 variables: top, bottom, left, right
 * Move left to right, top to bottom, right to left, bottom to top by checking the extreme conditions every time, and increase top, decrease bottom, decrease right, increase left accordingly so that you’re traversing in a spiral way
 * Add the elements to array list and return it
 */
// Your code here along with comments explaining your approach
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top=0, bottom =m-1, left=0, right=n-1;
        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left<=right){
            //left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i=top; i<=bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
            bottom--;
            }
            //bottom to top
            if(left<=right){
                for(int i=bottom ; i>=top; i--){
                    result.add(matrix[i][left]);
                }
            left++;
            }


        }
        return result;
    }
}