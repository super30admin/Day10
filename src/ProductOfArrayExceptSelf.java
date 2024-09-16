
// Time Complexity : o(n)
// Space Complexity : o(1) - since output array is not counted towards space complexity, note only auxiliary space is considered 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - 

// Your code here along with comments explaining your approach

/*
https://leetcode.com/problems/product-of-array-except-self/

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

Strategy -  product of whole array except nums[i] = product of all numbers to left of i
and to the right of i, make left product array in o(n), now calculate right product array
and multiply it with left product array
*/

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null || nums.length==0) return new int[0];
        
        int[] res = new int[nums.length];
        int runningProduct = 1;
        
        //running product of left subarray of nums[i]
        for(int i=0; i<nums.length; i++) {
            res[i] = runningProduct;
            runningProduct*=nums[i];
        }
        
        //running product of right subarray of nums[i]
        runningProduct = 1;
        for(int i=nums.length-1; i >=0; i--) {
            res[i]*= runningProduct;
            runningProduct*=nums[i];
        }
        
        return res;
    }
}