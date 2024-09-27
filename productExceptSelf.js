// Time Complexity : O(n) where n is nums length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var productExceptSelf = function(nums) {
    let result = [];
    result[0] = 1;
    let temp;
    let rp = 1;
    for(let i=1; i<nums.length; i++) {
        rp = rp * nums[i-1];
        result[i] = rp;
       
    }
    rp = 1;
    for(let i=nums.length - 2; i>=0; i--) {
        rp = rp * nums[i+1];
        result[i] *= rp;
    }
    return result;
};