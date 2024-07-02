/*
In this problem we need to travers 
CASE 1. LEFT --> RIGHT
CASE 2. UP --> DOWN
CASE 3. RIGHT --> LEFT
CASE 4. BOTTOM --> UP

4 directions recursive way

TC --> O(n*m)
SC --> O(1)
 */
import java.util.*;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //case 1 left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);

            }//for
            top++;

            //case 2 top to bottom
            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);

            }//for

            right--;

            //case 3 right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);

                }//for

                bottom--;
            }//if

            //case 4 bottom to top
            if (left <= right) {

                for (int j = bottom; j >= top; j--) {
                    res.add(matrix[j][left]);

                }
                left++;
            }

        }//while

        return res;

    }//method
}//class
