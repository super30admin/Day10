/*
    Leetcode problem 54: Spiral Matrix 
    T.C: O(m * n) :: S.C: O(1) - Expected to return a List of size m * n

    Solved using brute force approach: Run a loop from the topmost row left -> right
    then from the rightmost column loop from top -> bottom then from bottom row  loop
    from right -> left then from leftmost column loop from bottom -> top; This covers
    the first loop, and after each sub-loop make sure to update the top, left, right and bottom.
    We need to traverse the matrix at least once to retrieve the elements in spiral order.

    Refer to the comments in the code for the edge cases.
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;        
        int t = 0, l = 0, r = n - 1, b = m - 1; //t - top, l - left, r - right, b - bottom

        while (t <= b && l <= r) {
            int i = l;
            //For the top row move from left to right            
            while (i <= r) {
                result.add(matrix[t][i]);
                i++;
            }
            t++;
            //For the right column move from top to bottom
            i = t;
            while (i <= b) {
                result.add(matrix[i][r]);
                i++;
            }
            r--;
            //For the bottom row move from right to left
            i = r;
            while (t <= b && i >= l) { //check base case
                result.add(matrix[b][i]);
                i--;
            }
            b--;
            //For the left column move from bottom to up
            i = b;
            while (l <= r && i >= t) { //check base case
                result.add(matrix[i][l]);
                i--;
            }
            l++;
        }

        return result;
    }
}