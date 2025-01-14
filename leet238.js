// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english : Consider 2 arrays iterating from left to right and right to left with size of nums and inserting product inside left and right side arrays and at last multiplying both left and right array with each other iterating on each index with O(N) time 

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var productExceptSelf = function(nums) {
    var leftarr=new Array(nums.length);
    var rightarr=new Array(nums.length);
    var result = new Array(nums.length);
    leftarr[0]=1;
    rightarr[rightarr.length-1]=1;
    for(let i=1;i<leftarr.length;i++)
    {
        leftarr[i]=nums[i-1]*leftarr[i-1];
    }
    for(let j=rightarr.length-2;j>=0;j--)
    {
        rightarr[j]=nums[j+1]*rightarr[j+1];
    }
    for(let k=0;k<result.length;k++)
    {
        result[k] = leftarr[k]*rightarr[k];
    }
    return result;
};