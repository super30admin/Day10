/**
*    SpaceComplexity: O(N)
    */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int leftCount = 1;
        for(int i=0; i< nums.length; i++) {
            result[i] = leftCount;
            leftCount *= nums[i];
        }

        int rightCount = 1;
        for(int i=nums.length-1; i>=0; i--) {
            result[i] *= rightCount;
            rightCount *= nums[i];
        }
        return result;
    }
}
