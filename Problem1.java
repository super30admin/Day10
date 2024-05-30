// Time Complexity : O(n)
// Space Complexity : O(1) as we are using only 1 array and we are returning it.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:
// populate the result array with the product of elements to the left of each index using a running product.
// Then, multiply each element in the result array by the product of elements to the right of each index, using another running product.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0){
            return new int[] {};
        }

        // populate the result array with the product of elements to the left of each index using a running product.

        int[] result = new int[nums.length];

        int rp =1;
        result[0] = rp;

        for(int i =1; i< nums.length; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;

       // multiply each element in the result array by the product of elements to the right of each index, using another running product.

        for(int i = nums.length-2; i>= 0 ; i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}