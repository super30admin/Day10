// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var productExceptSelf = function(nums) {
    if(nums == null || nums.length == 0) return new Array().fill(0);
    let n = nums.length
    let prodNum = new Array(nums.length);
    let rp = 1, temp = 1

    for(let i = 0; i < n; i++){
        rp = rp*temp;
        prodNum[i] = rp;
        temp = nums[i]

    }
    temp = 1; rp = 1;
    for(let i = n-1; i >=0; i--){
        rp = rp*temp;
        prodNum[i] = prodNum[i]*rp;
        temp = nums[i]
    }
    return prodNum;

}