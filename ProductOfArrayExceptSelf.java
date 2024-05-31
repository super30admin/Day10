// Time Complexity : O(2N) = O(N) => As we iterate over all the elements
// Space Complexity : O(1) => Even though we are creating a new array of size N but we are returning that same array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Used running product method. First calculated left product by multiplying the value at i-1 with running product.
Then calculated right product by multiplying the value at i+1 with running product
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length == 0 || nums == null){
            return new int[]{};
        }

        int runningProduct = 1;
        int[] result = new int[nums.length];
        result[0] = 1;

        //Calculate left product
        for(int i=1; i<nums.length;i++){
            runningProduct = runningProduct*nums[i-1];
            result[i] = runningProduct;
        }

        runningProduct = 1;
        for(int i=nums.length-2; i>=0; i--){
            runningProduct = runningProduct *nums[i+1];
            result[i] = result[i]*runningProduct;
        }
        return result;
    }
}