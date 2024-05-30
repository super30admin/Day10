/**
 TC - O(n), SC - O(1)
 */
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        //For each element, calculate the product of left subarray and right subarray
        int result[] = new int[nums.length];

        //left running product
        int leftProduct = 1;
        result[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftProduct *= nums[i-1];
            result[i] = leftProduct;
        }

        int rightProduct =1;

        for(int i=nums.length-2; i >= 0; i--) {
            rightProduct *= nums[i+1];
            result[i] = rightProduct * result[i];
        }

        return result;
    }
}