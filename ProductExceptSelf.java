// TC: O(n) n: length of the array
// SC: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int left_result[] = new int[nums.length];
        int right_result[] = new int[nums.length];
        left_result[0] = 1;
        for(int i=1;i<nums.length;i++) {
            left_result[i] = left_result[i-1] * nums[i-1];
        }
        right_result[nums.length-1] =  1;
        for(int i=nums.length-2;i>=0;i--) {
            right_result[i] = right_result[i+1] * nums[i+1];
        }
        for(int i=0;i<nums.length;i++) {
            result[i] = left_result[i] * right_result[i];
        }
        return result;
    }
}


//TC: O(n) n: length of the array
//SC: O(1) Storing the final result in o/p array without using auxiliary space
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}