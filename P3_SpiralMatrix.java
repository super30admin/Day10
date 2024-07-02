/*
 * TC: O(n*m)
 * SC: O(1)
 * Did this code successfully run on Leetcode :yes
 Approach: 
 keep a counters on left right top and bottom, imagining them as walls.
 Based on the boundaries increase or decrease these counters and the loop on them accordingly
 to print the spiral matrix
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        while(left<=right && top <= bottom) {
            for(int col = left; col<=right;col++) {
                result.add(matrix[top][col]);
            }
            top++;
            for(int row=top; row <= bottom ; row++) {
                result.add(matrix[row][right]);
            }
            right--;
            if(top <= bottom) {
                for(int col=right; col >= left ; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int row=bottom; row>=top ; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
}