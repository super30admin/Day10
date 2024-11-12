/*
Time Complexity: O(m*n) spiral traversal

Space Complexity: O(1) no extra space is used

Did this code successfully run on Leetcode : Yes

We can also do this with recursion
 */

import java.util.ArrayList;
import java.util.List;

class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, left = 0, bottom = m-1, right = n-1;

        while(top <= bottom && left <= right)
        {
            /*
            Whenever we are mutating base condition variables inside a loop, we need
            to recheck it again before proceeding, here top, bottom, left and right change
            so they are traversing the same elements again and again till all the 4 for loops
            are done and then when it checks for while the loop breaks, to avoid this, we need
            to make sure that for every for loop the condition in while holds true
            */

            //1st for loop, nothing is mutated so no need to check
            for(int i = left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top ++;

            //Even though top changes above but the for loop will take care that top<=bottom
            for(int i = top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            /*
                Here both top and right are mutated above, so here we need to check for top<=bottom,
                regarding left and right is already handled in for loop
            */
            if(top <= bottom)
            {
                for(int i = right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            /*
            Here everything mutated but top and bottom are taken care by for loop so we only
            need to check for left and right
            */
            if(left <= right)
            {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}