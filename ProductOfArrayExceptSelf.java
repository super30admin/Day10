class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[1];
        }

        int[] output = new int[nums.length];
        int leftProduct = 1;
        output[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftProduct = leftProduct * nums[i - 1];
            output[i] = leftProduct;
        }

        int runningRightProduct = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            runningRightProduct = runningRightProduct * nums[i + 1];
            output[i] = output[i] * runningRightProduct;
        }

        return output;
    }
}
