// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1; // Initialize prefix product to 1
        int postfixProduct = 1; // Initialize postfix product to 1
        int[] result = new int[nums.length]; // Initialize result array of the same length as nums

        // Initialize the first element of result array
        result[0] = prefixProduct;

        // Calculate the prefix products and store in result array
        for (int i = 1; i < result.length; i++) {
            prefixProduct *= nums[i - 1]; // Update the prefix product with the previous number
            result[i] = prefixProduct; // Store the current prefix product in result array
        }

        // Calculate the postfix products and multiply with the existing prefix products in result array
        for (int i = result.length - 2; i >= 0; i--) {
            postfixProduct *= nums[i + 1]; // Update the postfix product with the next number
            result[i] *= postfixProduct; // Multiply the existing value in result array with postfix product
        }

        return result; // Return the final result array
    }
}
