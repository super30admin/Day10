// Time Complexity : O(n)
// Space Complexity : O(1) because result array being created is needed to be returned.
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution {
  public int[] productExceptSelf(int[] nums) {
    int runningProduct = 1;
    int n = nums.length;
    // Result array to be returned
    int[] result = new int[n];
    // Caculating the left product
    for(int i = 0; i<n; i++) {
      result[i] = runningProduct;
      runningProduct = runningProduct*nums[i];
    }
    runningProduct = 1;
    // Calculating right product and multiplying with left product
    for(int i = n-1; i>=0; i--) {
      result[i] = result[i]*runningProduct;
      runningProduct = runningProduct*nums[i];
    }
    return result;
  }
}