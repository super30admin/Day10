import java.util.*;
// Time Complexity :O(m*n)
// Space Complexity :O(1)-> as the result array we're using is what the problem ask us to return.
// Did this code successfully run on Leetcode :Yes
public class Problem3 {
//approach is to take 4 pointer and move with them .
    //so inside while loop ther are multiple operations happening do check for the while loop condition inside the while loop to.
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int left = 0;
        int right = colLength-1;
        int top = 0;
        int bottom = rowLength-1;
        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){
            //start from left  -> right add all the elements
            for(int i = left ;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //top -> bottom
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //right -> left
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom -> top
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
