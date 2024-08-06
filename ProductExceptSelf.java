//TC: O(n)
//SC: O(1) -> only auxilary space should be considered
//Approach: calculate the left side product and right side product array. Final product should be collated. Can be optimised using a single resultant array to reduce space complexity.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i=1;i<n;i++) result[i] = result[i-1] * nums[i-1]; //left products

        int rProd = 1;
        for(int i=n-2;i>=0;i--) { //right product
            rProd *= nums[i+1];
            result[i] *= rProd;
        }

        return result;
    }
}