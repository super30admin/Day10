//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// 238 Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: Calculate the left products
        output[0] = 1; // The product of elements to the left of index 0 is 1 (no elements)
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate the right products and combine with left products
        int rightProduct = 1; // The product of elements to the right of index n-1 is 1 (no elements)
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct; // Combine left and right products
            rightProduct *= nums[i]; // Update the right product
        }

        return output;
    }
}