import java.util.ArrayList;
import java.util.List;

/**
 TC - O(m*n), SC - O(1)
 */
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1, left =0, right = n-1;

        while(top <= bottom && left <= right) {
            //moving left to right
            for(int j = left; j <=right; j++) {
                list.add(matrix[top][j]);
            }

            top++;

            //move from top to bottom
            for(int i= top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            right--;

            //moving right to left
            if(bottom >= top) {
                for(int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }

                bottom--;
            }

            //moving bottom to top
            if(right >= left) {
                for(int i = bottom; i >=top; i--) {
                    list.add(matrix[i][left]);
                }

                left++;
            }
        }

        return list;

    }
}