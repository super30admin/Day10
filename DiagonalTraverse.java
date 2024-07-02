// Time Complexity : O(N*M)
// Space Complexity : O(N*M)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Get the total number of rows and columns
        int totalRow = mat.length;
        int totalColumn = mat[0].length;
        // Initialize the result array with the total number of elements
        int[] result = new int[totalRow * totalColumn];
        // Initialize the starting point
        int currentRow = 0;
        int currentColumn = 0;
        // Index to keep track of the position in the result array
        int idx = 0;
        // Boolean to determine the direction of movement
        boolean isMoveUp = true;

        // Iterate until all elements are added to the result array
        while (idx < result.length) {
            // Add the current element to the result array
            result[idx] = mat[currentRow][currentColumn];
            // Increment idx to move to the next position in the result array
            idx++;

            // If moving up diagonally
            if (isMoveUp) {
                // Check if we are at the top row but not the last column
                if (currentRow == 0 && currentColumn != totalColumn - 1) {
                    currentColumn++;
                    isMoveUp = false; // Change direction to down
                } 
                // Check if we are at the last column
                else if (currentColumn == totalColumn - 1) {
                    currentRow++;
                    isMoveUp = false; // Change direction to down
                } 
                // Move up diagonally
                else {
                    currentColumn++;
                    currentRow--;
                }
            } 
            // If moving down diagonally
            else {
                // Check if we are at the first column but not the last row
                if (currentColumn == 0 && currentRow != totalRow - 1) {
                    currentRow++;
                    isMoveUp = true; // Change direction to up
                } 
                // Check if we are at the last row
                else if (currentRow == totalRow - 1) {
                    currentColumn++;
                    isMoveUp = true; // Change direction to up
                } 
                // Move down diagonally
                else {
                    currentColumn--;
                    currentRow++;
                }
            }
        }
        // Return the result array
        return result;
    }
}
