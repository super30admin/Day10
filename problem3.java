// Time Complexity : o(n)
// Space Complexity : o(1) for answer array
// Did this code successfully run on Leetcode : Yes
// We solve by 4 pointers approach move the pointers based on the base conditions..

import java.util.ArrayList;
import java.util.List;

public class problem3 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res= new ArrayList<>();

        if(matrix.length == 0 || matrix[0].length == 0)
        {
            return res;
        }
        int left= 0, right= matrix[0].length-1, top=0, bottom= matrix.length;
        while (left <= right && top <= bottom)
        {
            for (int i = left; i <= right; i++)
            {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        return res;

    }
}