/*
TimeComplexity -> O(N+N) -> O(N)
Space Complexity -> O(1) -> Since we need to return the array if not then it would be O(N)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int rp = 1;
        int[] ar = new int[nums.length];
        ar[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rp = rp * nums[i - 1];
            ar[i] = rp;
        }

        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            ar[i] = ar[i] * rp;
        }

        return ar;
    }

}