class Solution {
    public int[] productExceptSelf(int[] nums) {

        //O(n) time and O(1) space

        if (nums == null || nums.length == 0) return result;

        int[] ans = new int[nums.length];

        ans[0] = 1;

        for (int i=1; i<nums.length; i++) {

            ans[i] = ans[i-1] * nums[i - 1];

        }

        int rSum = 1;
        for (int i=nums.length - 1; i>=0; i--) {

            ans[i] = ans[i] * rSum;
            rSum = rSum * nums[i];
        }

        return ans;

    }
}