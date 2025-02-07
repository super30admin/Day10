// Time complexity:- O(m * n)
// Space complexity:- O(m * n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * Approach:
 * This problem is about traversing a matrix in a spiral order, starting from the start of the matrix and moving in a spiral pattern around the boundries.
 * I defined four boundaries: startI, startJ, endI, and endJ that represent the top-left and bottom-right corners of the current layer of the matrix.
 * I moved in four directions right, down, left, and up until all elements are traversed in spiral order.
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // Initialize a list to store the result of elements
        List<Integer> result = new ArrayList<>();

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Define the boundaries for the travers
        int startI = 0;
        int startJ = 0;
        int endI = rows-1;
        int endJ = cols -1;

        // Initialize the direction variable to control the movement and set the dir to right because we start triverse to the right direction
        String dir = "right";

        // travers as long as until we are in the boundries 
        while(startI <= endI && startJ <= endJ) {
            //move right
            if(dir.equals("right")) {
                for (int j=startJ;j<=endJ;j++) {
                    result.add(matrix[startI][j]);
                }
                // row has finished, so increment the startI
                startI++;
                dir = "down";

            }
            //move down
            else if(dir.equals("down")) {
                for (int i=startI;i<=endI;i++) {
                    result.add(matrix[i][endJ]);
                }
                // column has finished, so decrement the endJ
                endJ--;
                dir = "left";
            }
            
            // move left
            else if(dir.equals("left")) {
                for (int j = endJ; j >= startJ; j--) {
                    result.add(matrix[endI][j]);
                }
                endI--;
                dir="up";
            }


        // move up
        else if(dir.equals("up")) {
            for (int i = endI; i >= startI; i--) {
                result.add(matrix[i][startJ]);
            }
            startJ++;
            dir="right";
        }

        }      
        return result;
    }
} 


