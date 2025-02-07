// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
Start from the first row, then go to rightmost column, go to bottom row and go to leftmost column. 
Then go inwards. Keep on iterating until top <= bottom and left <= right

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        List<Integer> result = new ArrayList<>();

        //If top and bottom cross each other or right and left cross each other, that means all elements have been iterated
        while(top <= bottom && left <= right) {

            //First row from left to right
            for(int i = left; i <= right; i++) {
            
                result.add(matrix[top][i]);
            }
            //Once top row is done, increment top
            top++;

            if(left <= right) {

                //Right column from top to bottom
                for(int j = top; j <= bottom; j++) {

                    result.add(matrix[j][right]);
                }

                //Once right column is done, decrement right
                right--;
            }

            if(top <= bottom) {

                //Bottom row from right to left
                for(int p = right; p >= left; p--) {

                    result.add(matrix[bottom][p]);
                }

                //Once bottom is done dec bottom
                bottom--;
            }

            if(left <= right) {

                //Left column from bottom to top
                for(int q = bottom; q >= top; q--) {

                    result.add(matrix[q][left]);
                }

                //Once left column if done
                left++;
            }
        }

        return result;
        //Time complexity = O(m * n)
        //Space complexity = O(1)
    }
}