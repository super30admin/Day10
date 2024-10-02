
// Time Complexity : 0(2n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int rp = 1;
        result[0]=rp;

        //left pass
        for(int i =1; i<n;i++)
        {
            rp = nums[i-1] * rp; 
            result[i]= rp;
            
        }
        rp =1;
        //right pass 
        for(int i = n-2; i>=0;i--)
        {
           rp = nums[i+1] * rp;
           result[i]= result[i] * rp;
        }
        return result;
    }
}