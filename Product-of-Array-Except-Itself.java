// Problem : 238. Product of Array Except Self

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
// Time Complexity : O(n)
// Space Complexity :O(1) as we are creating an array which is same as the retuen type so it will be constant space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
Solution:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Base Condition check
        if(nums==null || nums.length==0){
            return new int[]{};
        }
        //Declared an array sums
        int[] sum = new int[nums.length];
        sum[0]=1;
        int leftProduct=1;
        //Calculating the left sum 
        //We will initialize first element left sum as 1 as there are no elements
        for(int i=1;i<nums.length;i++){
            sum[i]=leftProduct*nums[i-1];
            leftProduct=leftProduct*nums[i-1];
        }
        leftProduct=1;
        //we are calculating the right sum by maintaining sum in left product variable
        for(int i=nums.length-2;i>=0;i--){
            leftProduct=leftProduct*nums[i+1];
            sum[i]=sum[i]*leftProduct;      
        }
        //at the end we arte returning a sum array
        return sum;
    }
}