import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Fix order of operations as left->right, top->bottom, right->left and last bottom->top. Until the two corresponding
pointers meet, keep adding the encountered values into the ArrayList. The base condition variables in the while loop
keep changing within the method and hence re-check the same conditions whenever necessary.
 */

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        //pointers
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        while(left <= right && top <= bottom) { //base condition

            //left to right
            for(int j=left; j<=right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            //top to bottom
            for(int i=top; i<=bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) { //base variables have changed above, hence re-check
                //right to left
                for(int j=right; j>=left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left <= right) { //base variables have changed above, hence re-check
                //bottom to top
                for(int i=bottom; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("The spiral order for the given matrix is " + spiralOrder(matrix));
    }
}