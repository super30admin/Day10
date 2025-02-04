import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        
        while(top<=bottom && left<= right){
            //top
            for(int j = left; j<= right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            if(top<=bottom){
            //right
            for(int i = top; i <= bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            }

             if(top<=bottom){
            //bottom
            for(int j = right; j>=left;j--){
                result.add(matrix[bottom][j]);
            }
                bottom--;
            }

            if(left<= right){
            //left
            for(int i = bottom; i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}