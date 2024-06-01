/*
    LC - 238. Product of Array Except Self
    TC - O(n)
    SC - O(1)
    Approach -
        Using running product method (to reduce the space complexity), we can reduce the space and find the product of array except self.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        for(int i=1; i<n; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i=n-2; i>=0; i--) {
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}