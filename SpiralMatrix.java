// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode :yes

import java.util.ArrayList;
import java.util.List;

/*
 * traverse through the matrix in a clockwise manner and keep reducing the boundary after each cycle.
 */
public class SpiralMatrix  {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        
        while(top<=bottom && left<=right){

            for (int j=left;j<=right;j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
            for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            }

            bottom--;

            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            }
            left++;

            
        }

        return result;

        
    }
}