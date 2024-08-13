// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Calculate left running product and right product and do the multiplications.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = 1;
        int rp = 1;
        for(int i = 1; i < nums.length; i++){
            //left running product
            rp = rp * nums[i-1];
            result[i] = rp ;
        }

        rp = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            //right running Product
            rp = rp * nums[i+1];

            result[i] = rp * result[i];
        }
       return result; 
    }
}