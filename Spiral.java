// Overall Time Complexity : O(n) . The n time taken to traverse all the elements
// Overall Space Complexity : O(1) . There is no extra space taken for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// This solution involves traversing a matrix in spiral order, starting from the top-left corner.  
// It moves in four directions (right, down, left, up) while adjusting boundaries after each pass.  
// The loop continues until all elements are visited, ensuring the correct spiral order traversal.


import java.util.ArrayList;
import java.util.List;

public class Spiral {
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int bottom = m -1 ;
        int right = n-1;

        while(top<=bottom && left <=right){

            //top row
            for(int j = left ; j<=right ; j++){
                result.add(matrix[top][j]);  
            }
            top++;
            
            //right
            if (top<=bottom && left <=right) {
                
                for(int i= top; i<=bottom;i++){
                result.add(matrix[i][right]);
                }
                right --;
            }
           
            // bottom
            if (top<=bottom && left <=right) {
                
                for(int j= right; j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom --;
            }
           
            //left
            if (top<=bottom && left <=right) {
                for(int i= bottom; i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
            


        }

     
    return result;
    }
    
}
