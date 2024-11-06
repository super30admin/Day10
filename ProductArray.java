// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach :

/**
 *  ProductArray : ProductArray
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 06, 2024)
 * @since : 1.0 (Nov 06, 2024)
 *
 */
 public class ProductArray {
 public int[] productExceptSelf(int[] nums) {
  int[] arr = new int[nums.length];
  arr[0] = 1;
  for(int i = 1; i < nums.length; i++){
   arr[i] = arr[i-1] * nums[i-1];
  }
  int tmp = 1;
  for(int i = nums.length-1;i>=0; i--){
   arr[i] = arr[i] * tmp;
   tmp *= nums[i];
  }
  return arr;
 }
}
