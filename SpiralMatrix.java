//The approach here is to to have four boundaries: top, right, left and bottom and we traverse from left->right, top->bottom, right->left, and bottom->top while checking the conditions
//Time Complexity:O(m*n)
//Space Complexity: O(1) as we are not using any extra space
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<Integer>();
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;

        while(top<=bottom && left<=right){
            for(int j = left; j<=right; j++){
                ans.add(matrix[top][j]);
            }
            top++;

            for(int i = top; i<= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int j = right; j>=left; j--){
                    ans.add(matrix[bottom][j]);
                }
            bottom--;
            }
            
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return ans;
        
    }
}
