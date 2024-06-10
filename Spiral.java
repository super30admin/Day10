/**
 * MOve form left -> right increment top
 * MOVE form top  -> bottom decrement right
 * MOve form right -> left decrement bottom
 * MOVE form bottom ->top increment left
 * TIme Complexity :O(m*n)
 * SPace COmplexity :O(1)
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        ArrayList<Integer>result = new ArrayList();
        while(top<=bottom && left<=right){
            for(int i= left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i= top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}
