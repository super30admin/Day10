import java.util.ArrayList;
import java.util.List;
/* Time Complexity: O(m*n) m*n matrix size
 * Space Complexity: O(1)
 * Leetcode: yes
 * Any Problems: no
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int colums = matrix[0].length-1;
        int rows = matrix.length-1;
        int left = 0, right = colums;
        int top = 0, bottom = rows;
        
        while(left <= right && top <= bottom)
        {
            for(int i = left; i <= right; i++)
            {
                arr.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++)
            {
                arr.add(matrix[i][right]);
            }
            right--;
            if(bottom >= top){
            for(int i = right; i >= left; i--)
            {
                arr.add(matrix[bottom][i]);
            }
            bottom--;
            }

            if(left <= right){
            for(int i = bottom; i >= top; i--)
            {
                arr.add(matrix[i][left]);
            }
            left++;
            }
        }
        return arr;
    }

}
