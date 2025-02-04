// Time Complexity :O(n*m) where n is row and m is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.ArrayList;
import java.util.List;
class problem_3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0; int bottom=m-1;
        int left=0; int right=n-1;
        while(top<=bottom&&left<=right){
            //top
            for (int j = left; j<=right;j++){
                result.add(matrix[top][j]);

            }
            top++;
            //right

            
            for (int i = top; i<=bottom;i++){
            result.add(matrix[i][right]);

            }
            right--;
            
            

            //bottom
            if(top<=bottom){
                for (int j = right; j>=left;j--){
                result.add(matrix[bottom][j]);

                }
                bottom--;
            }
            

            //left
            if(left<=right){
                for (int i = bottom; i>=top;i--){
                result.add(matrix[i][left]);

                }
                left++;
            }
        }
        return result;
    }
    public static void main(String args[]){
        problem_3 obj = new problem_3();
        // test case 1
        int [][] mat ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(obj.spiralOrder(mat));
    }
}


