// Time Complexity :O(N*N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Little bit, easy problem but had to be careful with boundary conditions
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
         if (matrix == null || matrix.length == 0) return result;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length-1;

        while (true){

            for(int j = left; j <= right; j++)
                result.add(matrix[top][j]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int j = right; j >= left; j-- )
                result.add(matrix[bottom][j]);
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--)
                result.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return result;
    }
}
