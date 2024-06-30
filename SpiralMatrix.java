// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0) return new ArrayList<>();
    int m = matrix.length;
    int n = matrix[0].length;
    // result list to be returned.
    List<Integer> result = new ArrayList<>();
    // Four pointers to maintain checks.
    int top = 0, bottom = m-1;
    int left = 0, right = n-1;
    while(left<=right && top<=bottom) {
      // Case 1: moving from left to right.
      for(int j = left; j<=right; j++) {
        result.add(matrix[top][j]);
      }
      top++;
      // Case 2: moving from top to bottom.
      for(int i = top; i<=bottom; i++) {
        result.add(matrix[i][right]);
      }
      right--;
      // Checking if top is still less than bottom.
      if(top<=bottom) {
        // Case 3: moving from right to left.
        for(int j = right; j>=left; j--) {
          result.add(matrix[bottom][j]);
        }
        bottom--;
      }
      // Checking if left is still less than right.
      if(left<=right) {
        // Case 4: moving from bottom to top.
        for(int i = bottom; i>=top; i--) {
          result.add(matrix[i][left]);
        }
        left++;
      }
    }
    return result;
  }
}