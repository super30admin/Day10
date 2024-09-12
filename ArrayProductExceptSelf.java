// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
            return new int[0];
        
        //initialisation
        int[] result = new int[nums.length];     
        
        //left
        result[0] = 1;
        for(int i=1; i<nums.length; i++) 
            result[i] = result[i-1]*nums[i-1];

        //right
        int right = 1;
        for(int i=nums.length-1; i>=0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        
        return result; 
    }
}