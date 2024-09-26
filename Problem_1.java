/*

Problem 1 : Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the 
product of all the elements of nums except nums[i].

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes


*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        int rp = 1;
        arr[0] = rp;
        //left product
        for(int i=1; i<n; i++){
            rp = rp * nums[i-1];
            arr[i] = rp;
        }

        //right product
        rp=1;
        for(int i = n-2; i>=0; i--){
            rp = rp * nums[i+1];
            arr[i] = rp * arr[i];
        }

        return arr;
        
    }
}