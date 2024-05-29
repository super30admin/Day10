//Time complexity: O(mxn)
//Space complexity: O(1)
import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left =0, right=n-1;
        int top=0, bottom =m-1;

        while(top<=bottom && left<=right){

            //move from left to right
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            //move from top to bottom
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //move from right to left
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
            }
            //move from bottom to top
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