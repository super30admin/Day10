import java.util.ArrayList;
import java.util.List;

public class Spiral {

    public List<Integer> spiralOrder(int[][] matrix) {

        //Time complexity: O(m*n)
        //Space complexity: O(n)
        List<Integer> result = new ArrayList<>();
       int m = matrix.length;
       int n = matrix[0].length;
       int top =0;
       int bottom = m-1;
       int left = 0;
       int right = n-1;
       int index = 0;
       while (top <= bottom && left <=right){
        //left ro right
        if (top <= bottom && left <=right){
        for (int i = left; i <=right;i++){
            result.add( matrix[top][i]);
        }
        top++;
        }
        //top to bottom
        if (top <= bottom && left <=right){
        for (int i = top; i<= bottom;i++){
            result.add(matrix[i][right]);
        }
        right--;
        }
        //right to left
        if (top <= bottom && left <=right){
        for (int i = right; i >= left;i--){
            result.add( matrix[bottom][i]);
        }
        bottom --;
        }
        if (top <= bottom && left <=right){
        for (int i = bottom; i >= top ;i--){
            result.add(matrix[i][left]);
        }
        left ++;
       }
       } 
       return result;
        
       } 
}