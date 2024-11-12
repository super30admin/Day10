/*
Time Complexity: O(m*n) spiral traversal

Space Complexity: In recursive solutions we have recursive stack space, that would be equal to the number of
                  spirals

Did this code successfully run on Leetcode : Yes
*/

import java.util.ArrayList;
import java.util.List;

class SpiralTraverseRecursion
{
    List<Integer> result;

    public List<Integer> spiralOrder(int[][] matrix) {

        this.result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, left = 0, bottom = m-1, right = n-1;

        helper(matrix, top, left, bottom, right);

        return result;
    }

    private void helper(int[][] matrix, int top, int left, int bottom, int right)
    {
        //Base Case
        if(top > bottom || left > right)
            return;

        //Logic
        //First will be Outer Spiral

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

        //Then call for Inner Spiral
        helper(matrix, top, left, bottom, right);
    }
}