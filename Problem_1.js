//https://leetcode.com/problems/product-of-array-except-self/description/
// Time Complexity : O(n)
// Space Complexity : O(1) // not including the auxilary space used for res
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let n = nums.length;
    let res = [];
    let rp=1;
    res[0] = rp;
    //left to right product, expect i in ith pos
    for(let i=1; i<n;i++){
        rp = rp*nums[i-1];
        res[i] = rp;
    }

    rp=1;
    //right to left product using running product
    for(let i=n-2; i>=0; i--){
        rp = rp*nums[i+1];
        res[i] = res[i]*rp;
    }
    return res;
};