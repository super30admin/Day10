// Description: In this we are storing the product of all the elements to the left of current element by maintaining a running product 
// at each index, and then computing the right and multiplying it by left that was previously stored in result array.

// Time Complexity : O(n) - Going through each element in nums array(There are 2 'for' loops = n+n = 2n but constant we can ignore, so O(n))
// Space Complexity : O(1) - Because result array is what they are asking us to return. So, no extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Base Condition
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int n = nums.length;
        // Result array that will store the left elements sum first
        int[] result = new int[n];
        // Running product variable
        int rp = 1;
        // First element have no element to the left of it, so it's value = 1
        result[0] = rp;
        // Compute the product of all the elements on left of the current element
        for (int i = 1; i < n; i++) {
            // Compute the rp
            rp = rp * nums[i - 1];
            // Store it in the result array
            result[i] = rp;
        }
        // Again set rp to 1
        rp = 1;
        // Compute the right product and multiply it with left product that is stored in
        // result
        for (int i = n - 2; i >= 0; i--) {
            // Start from (n-2) second last element because there is no element to the right
            // of last element, so the current value what it has is the final ans for last
            // element
            rp = rp * nums[i + 1];
            // Multiply the right to the left
            result[i] = result[i] * rp;
        }
        // Return result array
        return result;
    }
}