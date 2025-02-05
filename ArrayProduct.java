// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Calculating the product of elements to the left and then updating it with the product of
// elements to the right

// Your code here along with comments explaining your approach

class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = 1;

        // product of all elements to the left of the current element.
        for (int i = 1; i < len; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rp = 1;
        // product of all elements to the right of the current element.
        for (int i = len - 2; i >= 0; i--) {
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}