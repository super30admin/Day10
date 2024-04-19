// Time Complexity : O(mn)
// Space Complexity : O(1)- since we are returning the result we need not add it to the space complexity
// Did this code successfully run on Leetcode : Yes

/*
 * Have four boundary variables we follow the following treversal 
 *  left->right (top is constant); 
 *  top -> bottom (right is constant) ; 
 *  right -> left (bottom is constant); 
 *  bottom -> top (left is constant)
 * 
 * Have the base condition check for every iteration or traversal because we are changing the variables inside the while loop.
 */

import java.util.*;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0, bottom = r - 1, left = 0, right = c - 1;

        while (top <= bottom && left <= right) {
            // left->right (top is constant);, while in loop so increment after;
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]); // top is constant
            }
            top++;

            if (top <= bottom && left <= right) {
                // top->bottom (right is constant);, while in loop so increment after;
                for (int j = top; j <= bottom; j++) {
                    result.add(matrix[j][right]);
                }
                right--;
            }
            if (top <= bottom && left <= right) {
                // right ->left (bottom is constant);, while in loop so increment after;
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (top <= bottom && left <= right) {
                // bottom->top (left is constant), while in loop so increment after;
                for (int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }

        return result;
    }
}
