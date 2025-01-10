// Time Complexity : O (n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int i;
        int l = nums.length;
        result[l - 1] = 1;
        // Create a right-product suffix array
        for (i = l - 2; i >= 0; i--) {
            result[i] = result[i + 1] * nums[i + 1];
        }
        int left = 1;
        // Multiply it with the running left-product prefix to get the result
        for(i = 0; i < l; i++) {
            result[i] = left * result[i];
            left *= nums[i];
        }
        return result;
    }
}