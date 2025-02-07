// Time complexity:- O(n)
// Space complexity:- O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * Approach:
 * This problem is about calculating the product of all elements in the array except self, without using division.
 * I used two arrays: one to store the  product of elements to the left of each index, and another to store the product of elements to the right.
 * Finally, we combine the left and right products for each index to compute the result.
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Create arrays to store the product of elements to the left and right of each index
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        //Initialize the result array to store the final products
        int[] result =  new int[nums.length];

        // Set the first element of left array to 1 since there are no elements to the left of the first element
        left[0] = 1;

        // Set the last element of the right array to 1 since there are no elements to the right of the last element
        right[right.length-1] = 1;

        // Fill the left array, where left[i] is the product of all elements to the left of i
        for(int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        // Fill the right array, where right[i] is the product of all elements to the right of i
        for(int i = n-2; i >= 0; i--) {
            right[i] = right[i +1] * nums[i + 1];
        }
        
        // Multiply the  elements from the left and right arrays to get the final result
        for(int i = 0; i < left.length; i++) {
            result[i] = left[i] * right[i];
        }
    // Return the final array with the product of all elements except nums[i] 
    return result;
    }
} 


