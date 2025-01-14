
//TC: O(n)
//SC: O(1)

class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int[] resultArr = new int[nums.length];
        int rProd = 1;
        resultArr[0] = rProd;
        for (int i = 1; i < nums.length; i++) {
            rProd = rProd * nums[i - 1];
            resultArr[i] = rProd;
        }
        rProd = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rProd = rProd * nums[i + 1];
            resultArr[i] = resultArr[i] * rProd;
        }
        return resultArr;
    }
}