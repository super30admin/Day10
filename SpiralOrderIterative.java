// Time Complexity : o(M*N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// We go from left to right and then top to bottom decrementing top and bottom and left and right after each row/col completion so as to pick up the right t/b/l/r

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

class SpiralOrderIterative {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }
        spiralOrderHelper(matrix, 0, matrix.length-1, 0, matrix[0].length-1, result);
        return result;
    }
    private void spiralOrderHelper(int [][] matrix, int top, int bottom, int left, int right, List<Integer> result){
        if(top>bottom || left>right){
            return;
        }
        for(int i=left;i<=right;i++){
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
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
        spiralOrderHelper(matrix, top, bottom, left, right, result);
    }
    public static void main(String[] args) {
        SpiralOrderIterative obj = new SpiralOrderIterative();
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.spiralOrder(mat));
    }
}