// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
  public int[] findDiagonalOrder(int[][] mat) {
    if(mat == null || mat.length == 0) return new int[]{};
    int m = mat.length;
    int n = mat[0].length;
    // array to be returned, therefore does not add to the space complexity.
    int[] result = new int[m*n];
    int index = 0;
    int row = 0;
    int col = 0;
    int dir = 1;
    while(index<m*n) {
      result[index] = mat[row][col];
      index++;
      // dir == 1 -> bottom-up
      if(dir == 1) {
        if(col == n-1) {
          dir = -1;
          row++;
        }
        else if(row == 0) {
          dir = -1;
          col++;
        }else {
          row--;
          col++;
        }
      // dir == -1 -> top-bottom
      }else {
        if(row == m-1) {
          dir = 1;
          col++;
        }
        else if(col == 0) {
          dir = 1;
          row++;
        }else {
          col--;
          row++;
        }
      }
    }
    return result;
  }
}