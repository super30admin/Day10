// TC: O(n)
// SC: O(n)
// This passes over the nums array 3 times
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[] {};
        }
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        leftProd[0] = nums[0];
        rightProd[nums.length - 1] = nums[nums.length - 1];
        for(int i = 1; i < nums.length; i++) {
            leftProd[i] = leftProd[i - 1] * nums[i];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            rightProd[i] = rightProd[i + 1] * nums[i];
        }
        nums[0] = rightProd[1];
        nums[nums.length - 1] = leftProd[nums.length - 2];
        for(int i = 1; i < nums.length - 1; i++) {
            nums[i] = rightProd[i + 1] * leftProd[i - 1];
        }
        return nums;
    }
}