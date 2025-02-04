// Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements
// of nums except nums[i].

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, first found the product of the elements on left side are found and later the product of right side elements is found and the left and
 * right products are multiplied. This gives the product of all the elements except itself array.
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        result[0] = 1;
        int rp = 1;
        for(int i=1;i<n;i++){
            rp *= nums[i-1];
            result[i] = rp;
        } 
        // again make rp as 1 to find right product
        rp = 1;
        for(int i=n-2;i>=0;i--){
            rp *= nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}