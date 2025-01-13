/**
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(1) since integer array return type is expected.
 * 
 * Did this code successfully run on Leetcode: Yes
 * 
 * Description: We iterate from 1 to n and calculate running product of elements
 * to the left in one pass.
 * We then iterate from n-2 to 0 and calculate running product of elements to
 * the right in second pass.
 */

public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    if (nums == null || nums.length == 0) {
      return new int[] {};
    }
    int n = nums.length;
    int[] result = new int[n];
    int rp = 1;
    result[0] = rp;
    for (int i = 1; i < n; i++) {
      rp = rp * nums[i - 1];
      result[i] = rp;
    }
    rp = 1;
    for (int i = n - 2; i >= 0; i--) {
      rp = rp * nums[i + 1];
      result[i] = result[i] * rp;
    }
    return result;
  }
}
