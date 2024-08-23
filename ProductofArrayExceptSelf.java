// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i=1;i<nums.length-1;i++){
            result[i] = result[i-1] * nums[i];
        }
        result[nums.length-1] = result[nums.length-2];
        int mul = nums[nums.length-1];
        for(int i=nums.length-2;i>0;i--){
            result[i] = mul * result[i-1];
            mul = mul * nums[i];
        }
        result[0] = mul;
        return result;
    }
}
